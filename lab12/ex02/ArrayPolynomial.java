package oop_hus.lab12.ex02;

import java.util.Arrays;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if(checkBoundaries(index, size)) {
            return coefficents[index];
        }
        System.out.println("Wrong index !!!");
        return 0;
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if(size + 1 == coefficients().length) {
            enlarge();
        }
        coefficents[size] = coefficient;
        ++size;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if(checkBoundaries(index, size)) {
            if (size + 1 == coefficents.length) {
                enlarge();
            }
            for (int i = size; i > index; --i) {
                coefficents[i] = coefficents[i - 1];
            }
            coefficents[index] = coefficient;
            ++size;
        } else {
            System.out.println("Wrong index !!!");
        }
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if(checkBoundaries(index, size)) {
            coefficents[index] = coefficient;
        }
        else {
            System.out.println("Wrong index !!!");
        }
        return this;
    }
    
    public ArrayPolynomial remove(int index) {
        if (checkBoundaries(index, size)) {
            for (int i = index; i < size - 1; ++i) {
                coefficents[i] = coefficents[i + 1];
            }
            --size;
        }
        return this;
    }
    
    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        while (coefficents[size] == 0) {
            size--;
        }
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for(int i = degree(); i >= 0; --i) {
            result = result * x + coefficents[i];
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        ArrayPolynomial arrayPolynomialDerive = new ArrayPolynomial();
        double[] coefficient = coefficients();
        for (int degree = 1; degree < coefficient.length; ++degree) {
            arrayPolynomialDerive.append(degree * coefficient[degree]);
        }
        return arrayPolynomialDerive;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
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

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        result.coefficents = new double[Math.max(this.coefficents.length,
                another.coefficents.length)];
        System.arraycopy(this.coefficents, 0, result.coefficents, 0,
                this.coefficents.length);
        for (int i = 0; i < another.coefficents.length; i++) {
            result.coefficents[i] -= another.coefficents[i];
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        ArrayPolynomial result = new ArrayPolynomial();
        result.coefficents = new double[this.coefficents.length + another.coefficents.length - 1];
        Arrays.fill(result.coefficents, 0);
        for (int i = 0; i < this.coefficents.length; i++) {
            for (int j = 0; j < another.coefficents.length; j++) {
                result.coefficents[i + j] += this.coefficents[i] * another.coefficents[j];
            }
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
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
