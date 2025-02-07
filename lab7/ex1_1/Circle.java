package oop_hus.lab7.ex1_1;

public class Circle extends Shape {
    // Radius of the circle
    private double radius;

    // Default constructor
    public Circle() {
        super();
        radius = 1.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filles) {
        super(color, filles);
        this.radius = radius;
    }
    // Getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods
    // Area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + super.toString() + ", radius=" + getRadius() + "]";
    }
}
