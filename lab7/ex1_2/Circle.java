package oop_hus.lab7.ex1_2;

public class Circle implements GeometricObject {
    private double radius; // Radius of the circle

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // toString method
    public String toString̣̣() {
        return "Circle[radius" + this.radius + ']';
    }

    // Implements method
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
