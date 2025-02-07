package oop_hus.lab7.ex1_1;

public abstract class Shape {

    // color and filled denotes protected access modifier
    protected String color;
    protected Boolean filled;

    // default constructor
    Shape() {
        color = "red";
        filled = true;
    }

    // parameterized constructor
    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    // abstract methods(it will be implemented in the subclass)
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString method
    @Override
    public String toString() {
        return "Shape[color=" + getColor() + ", filled=" + getFilled() + "]";
    }

}
