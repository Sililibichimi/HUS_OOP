package oop_hus.lab12.ex02;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        if(checkBoundaries(index, coefficients.size())) {
            return coefficients.get(index);
        }
        System.out.println("Wrong index !!!");
        return 0.0;
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] result = new double[this.coefficients.size()];
        for (int index = 0; index < this.coefficients.size(); index++) {
            result[index] = this.coefficients.get(index);
        }
        return result;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        if(checkBoundaries(index, coefficients.size())) {
            coefficients.add(index, coefficient);
        } else {
            System.out.println("Wrong index !!!");
        }
        return this;
    }

    public ListPolynomial remove(int index) {
        if(checkBoundaries(index, coefficients.size())) {
            coefficients.remove(index);
        }
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        while (coefficients.getLast() == 0) {
            coefficients.removeLast();
        }
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result  = 0.0;
        for(int i = degree(); i >= 0; --i) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial polynomialDerive = new ListPolynomial();
        for(int i = 1; i <= degree(); ++i) {
            polynomialDerive.append(coefficients.get(i) * i);
        }
        return polynomialDerive;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        ListPolynomial result = new ListPolynomial();
        if (this.coefficients.size() > another.coefficients.size()) {
            result.coefficients = this.coefficients;
        } else {
            result.coefficients = another.coefficients;
        }
        for (int i = 0; i < this.coefficients.size(); i++) {
            result.coefficients.set(i, this.coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++) {
            result.coefficients.set(i, result.coefficients.get(i) + another.coefficients.get(i));
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        ListPolynomial result = new ListPolynomial();
        if (this.coefficients.size() > another.coefficients.size()) {
            result.coefficients = this.coefficients;
        } else {
            result.coefficients = another.coefficients;
        }
        for (int i = 0; i < this.coefficients.size(); i++) {
            result.coefficients.set(i, this.coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++) {
            result.coefficients.set(i, result.coefficients.get(i) - another.coefficients.get(i));
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < coefficients.size() + another.coefficients.size() - 1; i++) {
            result.append(0);
        }
        for (int i = 0; i < coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                result.set(result.coefficient(i + j) + coefficients.get(i) * another.coefficients.get(j), i + j);
            }
        }
        return result;
    }
}
