package oop_hus.finalexam.integration;

import java.util.LinkedList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new LinkedList<Double>();
    }

    public ListPolynomial(double[] coefficients) {
        this.coefficients = new LinkedList<Double>();
        for (double coefficient : coefficients) {
            append(coefficient);
        }
    }

    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    @Override
    public double[] coefficients() {
        double[] coefficients0 = new double[coefficients.size()];
        for (int i = 0; i < coefficients0.length; i++) {
            coefficients0[i] = coefficients.get(i);
        }
        return coefficients0;
    }

    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    public ListPolynomial insert(double coefficient, int index) {
        coefficients.add(index, coefficient);
        return this;
    }

    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public double evaluate(double x) {
        double res = 0.0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            res = res * x + coefficient(i);
        }
        return res;
    }

    @Override
    public Polynomial derivative() {
        return new ListPolynomial(differentiate());
    }

    public ListPolynomial plus(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] += (i <= degree2)? another.coefficient(i) : 0;
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    public ListPolynomial minus(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] -= (i <= degree2)? another.coefficient(i) : 0;
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    public ListPolynomial multiply(ListPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = degree1 + degree2;
        double[] coefficients0 = new double[degree + 1];
        for (int i1 = 0; i1 <= degree1; i1++) {
            for (int i2 = 0; i2 <= degree2; i2++) {
                coefficients0[i1 + i2] += coefficient(i1) * another.coefficient(i2);
            }
        }
        ListPolynomial listPolynomial = new ListPolynomial(coefficients0);
        listPolynomial.reduce();
        return listPolynomial;
    }

    private void reduce() {
        int currentSize = coefficients.size();
        for (int i = currentSize - 1; i >= 0; i--) {
            if (coefficient(i) == 0) {
                currentSize--;
            } else {
                break;
            }
        }
        coefficients = coefficients.subList(0, currentSize);
    }
}
