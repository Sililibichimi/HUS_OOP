package oop_hus.lab7.ex1_5;

public class Circle implements GeometricObject {
    protected double radius; // Declare protected instance variable radius

    // Default constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // toString method
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    // Implement the getArea method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implement the getPerimeter method
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
