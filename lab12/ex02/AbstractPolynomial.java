package oop_hus.lab12.ex02;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        double[] coefficients = coefficients();
        StringBuilder sb = new StringBuilder();
        for (int degree = 0; degree < coefficients.length; ++degree) {
            double coefficient = coefficients[degree];
            int temp = Double.compare(coefficient, 0);
            if (temp != 0) {
                if (temp > 0) {
                    if (sb.isEmpty()) {
                        sb.append(coefficient);
                    } else {
                        sb.append(" + ").append(coefficient);
                    }
                } else {
                    sb.append(" - ").append(-coefficient);
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb.append(" * x ");
                    } else {
                        sb.append(String.format(" * x ^ %d", degree));
                    }
                }
            }
        }
        if (sb.isEmpty()) {
            sb.append(0);
        }
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        double[] coefficient = coefficients();
        double[] coefficientDerive = new double[coefficient.length];
        for (int degree = 1; degree < coefficient.length; ++degree) {
            coefficientDerive[degree - 1] = degree * coefficient[degree];
        }
        coefficientDerive[coefficient.length - 1] = 0;
        return coefficientDerive;
    }

    boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index < limit;
    }
}
