package oop_hus.lab5.Ex1;

public class MyComplex {

    private double real;
    private double imag;

    // Constructors
    public MyComplex() {
        this.real = 0;
        this.imag = 0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getter and Setter
    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString
    @Override
    public String toString() {
        if (this.imag >= 0) {
            return "(" + this.real + " + " + this.imag + "i)";
        } else {
            return "(" + this.real + " - " + (-this.imag) + "i)";
        }
    }

    // isReal and isImaginary
    public boolean isReal() {
        return this.imag == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    // equals
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // Magnitude and Argument
    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    // Add, Subtract, Multiply, Divide
    public MyComplex add(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        return new MyComplex((this.real * right.real + this.imag * right.imag) / denominator, (this.imag * right.real - this.real * right.imag) / denominator);
    }

    // Conjugate
    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
