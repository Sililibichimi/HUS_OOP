package oop_hus.lab7.ex1_2;

public class Rectangle implements GeometricObject {
    public double width; // Width of the rectangle
    public double length; // Length of the rectangle

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // toString method
    public String toString() {
        return "Rectangle[width=" + this.width + ", length=" + this.length + ']';
    }

    // Implements method
    // Calculate the area of the rectangle
    @Override
    public double getArea() {
        return this.width * this.length;
    }

    // Calculate the perimeter of the rectangle
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
}
