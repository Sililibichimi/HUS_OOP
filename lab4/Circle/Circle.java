package oop_hus.lab4.Circle;

public class Circle {
    private double radius;
    private String color;

    // Constructors a Circle instace with default value for radius and color
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    //Constructors a Circle instance with the given radius and default color
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    //Constructors a Circle instance with the given radius and color
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    //Return the color of this Circle instance
    public String getColor() {
        return color;
    }

    //Return the radius of this Circle instance
    public double getRadius() {
        return radius;
    }

    //Return the area of this Circle instance
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Setter for instance variable radius
    public void setRadius(double r) {
        radius = r;
    }

    //Setter for instance variable color
    public void setColor(String c) {
        color = c;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

}
