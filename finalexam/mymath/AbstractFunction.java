package oop_hus.finalexam.mymath;

public interface AbstractFunction {
    double evaluate(double x);
    AbstractFunction getDerivative();
    void setDerivative(AbstractFunction derivative);
}
