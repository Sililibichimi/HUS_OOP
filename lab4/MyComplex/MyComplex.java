package oop_hus.lab4.MyComplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    // Getters and Setters

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + (imag > 0 ? "+" : " ") + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    // check if this complex number is equal to another
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // calculate magnitude of this complex number
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // add another complex number to this complex number
    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right) {
        double newReal = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        double newImag = (this.imag * right.real - this.real * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divideNew(MyComplex right) {
        return new MyComplex((this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag), (this.imag * right.real - this.real * right.imag) / (right.real * right.real + right.imag * right.imag));
    }

    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex(this.real, -this.imag);
        return newComplex;
    }
}
