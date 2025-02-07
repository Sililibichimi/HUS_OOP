package oop_hus.finalexam.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;


    public ArrayPolynomial() {
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayPolynomial(double[] coefficients) {
        this.coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
        for (double coeficient : coefficients) {
            append(coeficient);
        }
    }

    @Override
    public double coefficient(int index) {
        if(checkBoundaries(index, size)) {
            return coefficents[index];
        }
        System.out.println("Index khong hop le");
        return 0.0;
    }

    @Override
    public double[] coefficients() {
        return coefficents;
    }

    public ArrayPolynomial append(double coefficient) {
        if(size == coefficents.length) {
            enlarge();
        }
        coefficents[size] = coefficient;
        size++;
        return this;
    }

    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == coefficents.length) {
            enlarge();
        }
        for (int i = size - 1; i >= index; i--) {
            coefficents[i+1] = coefficents[i];
        }
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    public ArrayPolynomial set(double coefficient, int index) {
        if(checkBoundaries(index, size)) {
            coefficents[index] = coefficient;
        }
        else {
            System.out.println("Wrong index !!!");
        }
        return this;
    }

    @Override
    public int degree() {
        int degree = size;
        while (coefficents[degree - 1] == 0) {
            degree--;
        }
        return degree;
    }

    @Override
    public double evaluate(double x) {
        double result = 0;
        for(int i = degree(); i >= 0; --i) {
            result = result * x + coefficents[i];
        }
        return result;
    }

    @Override
    public Polynomial derivative() {
        ArrayPolynomial arrayPolynomialDerive = new ArrayPolynomial();
        double[] coefficient = coefficients();
        for (int degree = 1; degree < degree(); ++degree) {
            arrayPolynomialDerive.append(degree * coefficient[degree]);
        }
        return arrayPolynomialDerive;
    }

    public ArrayPolynomial plus(ArrayPolynomial another) {
        ArrayPolynomial sum = new ArrayPolynomial();
        sum.coefficents = new double[Math.max(this.coefficents.length,
                another.coefficents.length)];
        System.arraycopy(this.coefficents, 0, sum.coefficents, 0,
                this.coefficents.length);
        for (int i = 0; i < another.coefficents.length; i++) {
            sum.coefficents[i] += another.coefficents[i];
        }
        return sum;
    }

    public ArrayPolynomial minus(ArrayPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = Math.max(degree1, degree2);
        double[] coefficients0 = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            coefficients0[i] += (i <= degree1)? coefficient(i) : 0;
            coefficients0[i] -= (i <= degree2)? another.coefficient(i) : 0;
        }
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial(coefficients0);
        arrayPolynomial.reduce();
        return arrayPolynomial;
    }

    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int degree1 = degree();
        int degree2 = another.degree();
        int degree = degree1 + degree2;
        double[] newCoef = new double[degree + 1];
        for (int i = 0; i <= degree1; i++) {
            for (int j = 0; j <= degree2; j++) {
                newCoef[i + j] += coefficient(i) * another.coefficient(j);
            }
        }
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial(coefficents);
        arrayPolynomial.reduce();
        return arrayPolynomial;
    }

    private void enlarge() {
        double[] newCoefficents = new double[size * 2];
        for (int i = 0; i < size; ++i) {
            newCoefficents[i] = coefficents[i];
        }
        coefficents = newCoefficents;
    }

    private void reduce() {
        int currentSize = size;
        for (int i = currentSize - 1; i >= 0; i--) {
            if (coefficient(i) == 0) {
                size--;
            } else {
                break;
            }
        }
    }
}
