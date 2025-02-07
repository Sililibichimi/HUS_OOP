package oop_hus.lab6.ex4;

public class TestShape {
    public static void main(String[] args) {
        // Test CirCle
        // Create a Circle object with default constructor
        Circle c1 = new Circle();
        // Set radius of c1 to 6.9
        c1.setRadius(6.9);
        // Print c1
        System.out.println(c1);
        System.out.println("Radius of c1: " + c1.getRadius() + "\nArea of c1: " + c1.getArea()
                + "\nPerimeter of c1: " + c1.getPerimeter());
        System.out.println();
        // Test Rectangle
        // Create a Rectangle object with default constructor
        Rectangle r1 = new Rectangle();
        // Set width and length of r1 to 6.0 and 9.0
        r1.setWidth(6.0);
        r1.setLength(9.0);
        // Print r1
        System.out.println(r1);
        System.out.println("Width of r1: " + r1.getWidth()
                + "\nLength of r1: " + r1.getLength()
                + "\nArea of r1: " + r1.getArea() + "\nPerimeter of r1: " + r1.getPerimeter());
        System.out.println();
        // Test Square
        // Create a Square object with default constructor
        Square s1 = new Square();
        // Set side of s1 to 6.9
        s1.setSide(6.9);
        // Print s1
        System.out.println(s1);
        System.out.println("Side of s1: " + s1.getSide()
                + "\nArea of s1: " + s1.getArea()
                + "\nPerimeter of s1: " + s1.getPerimeter());
    }
}
