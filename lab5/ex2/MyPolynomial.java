package oop_hus.lab5.ex2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int degree = 0;
        for (int i = coeffs.length - 1; i >= 0; --i) {
            if (coeffs[i] != 0) {
                degree = i;
                break;
            }
        }
        return degree;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        boolean isNegative = false;
        for (int i = this.getDegree(); i > 0; --i) {
            if (coeffs[i] != 0) {
                isNegative = coeffs[i - 1] < 0;
                if (i > 1) {
                    if (coeffs[i] != 1) {
                        s.append(coeffs[i] + "x^" + i);
                    } else {
                        s.append("x^" + i);
                    }
                } else {
                    if (coeffs[i] != 1) {
                        s.append(coeffs[i] + "x");
                    } else {
                        s.append("x");
                    }
                }
            }
            if (coeffs[i - 1] != 0) {
                if (!isNegative) {
                    s.append(" + ");
                } else {
                    s.append(" - ");
                    coeffs[i - 1] = -coeffs[i - 1];
                }
            }
        }
        if (coeffs[0] != 0) {
            if (coeffs[0] > 0) {
                s.append(coeffs[0]);
            } else {
                s.append(-coeffs[0]);
            }
        }
        return s.toString();
    }

    public double evaluate(double x) {
        double res = 0.0;
        for (int i = coeffs.length - 1; i >= 0; --i) {
            res = res * x + coeffs[i];
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; ++i) {
            if (i <= this.getDegree() && i <= right.getDegree()) {
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            } else if (i <= this.getDegree()) {
                newCoeffs[i] = this.coeffs[i];
            } else {
                newCoeffs[i] = right.coeffs[i];
            }
        }
        this.coeffs = newCoeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[(this.getDegree()) + (right.getDegree()) + 1];
        for (int i = 0; i <= this.getDegree(); ++i) {
            for (int j = 0; j <= right.getDegree(); ++j) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        this.coeffs = newCoeffs;
        return this;
    }

    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(-1.0, 2.3, 3.2);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println(p1);
        System.out.println(p2.getDegree());
        System.out.println(p1.add(p2));
        System.out.println(p1.evaluate(2));
        System.out.println(p1.multiply(p2));
    }
}
