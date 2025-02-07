package oop_hus.lab4.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        //Test program to test all constructors and public methods
        MyPoint point1 = new MyPoint(); // Test constructor
        System.out.println(point1); // Test toString()

        // Test Setters
        point1.setX(6);
        point1.setY(8 + 1);

        // Test Getters
        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());
        point1.setXY(3, 0); // Test setXY()
        System.out.println(point1.getXY()[0]); // Test getXY()
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint point2 = new MyPoint(96, 69); // Test another constructor
        System.out.println(point2);

        // Testing the overloaded methods distance()
        System.out.println(point1.distance(point2)); // Vesion 1
        System.out.println(point2.distance(point1)); // Version 1
        System.out.println(point1.distance(96, 69)); // Version 2
        System.out.println(point1.distance()); // Distance from origin

    }
}
