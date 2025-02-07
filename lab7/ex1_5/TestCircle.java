package oop_hus.lab7.ex1_5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5); // declare a circle object
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        GeometricObject rc = new Circle(5); // declare a resizable circle object
        System.out.println(rc);
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}
