package oop_hus.lab6.Ex7;

public class Cylinder extends Circle {
    private Circle base; //Bottom plane of the cylinder
    private double height; // Height of the cylinder

    // Constructors
    public Cylinder() {
        this.base = new Circle();
        height = 1.0;
    }

    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }

    public Cylinder(double r, double height, String c) {
        super(r, c);
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    // Calculate Area
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height + 2 * super.getArea();
    }

    // Calculate Volume
    public double getVolume() {
        return super.getArea() * height;
    }

    //toString
    @Override
    public String toString() {
        return "Cylinder[base=" + super.toString() + ",height=" + height + "]";
    }
}
