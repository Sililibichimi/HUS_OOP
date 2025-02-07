package oop_hus.lab7.ex1_1;

public class Rectangle extends Shape {
    private double width;// Width of the rectangle
    private double length;// Length of the rectangle

    // Default constructor
    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter and setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Implementing abstract methods
    // Area of the rectangle
    @Override
    public double getArea() {
        return width * length;
    }

    // Pereimeter of the rectangle
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
