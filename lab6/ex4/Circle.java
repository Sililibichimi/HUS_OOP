package oop_hus.lab6.ex4;

public class Circle extends Shape {
    // Radius of circle
    private double radius;

    // Constructor
    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    // Getters and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get area of circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Get perimeter of circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
