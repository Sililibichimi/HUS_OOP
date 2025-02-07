package oop_hus.lab6.ex1;

public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate Volume
    public double getVolume() {
        return super.getArea() * height;
    }

    //toString
    @Override
    public String toString() {
        return "Cylinder[radius=" + super.getRadius() + ",height=" + height + ",color=" + super.getColor() + "]";
    }
}
