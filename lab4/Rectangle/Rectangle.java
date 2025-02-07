package oop_hus.lab4.Rectangle;

public class Rectangle {
    // Length and width of the rectangle
    private float length;
    private float width;

    // Constructor
    Rectangle() {
        this(1.0f, 1.0f);
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //Getters and Setters of the length and width
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return (double) length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return (double) 2 * (length + width);
    }

    // toString method
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
