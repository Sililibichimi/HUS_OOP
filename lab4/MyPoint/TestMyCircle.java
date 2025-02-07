package oop_hus.lab4.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        // Test constructors and public methods
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1);

        MyCircle circle2 = new MyCircle(2, 3, 5);
        System.out.println(circle2);

        MyPoint center = new MyPoint(4, 5);
        MyCircle circle3 = new MyCircle(center, 6);
        System.out.println(circle3);

        // Test Setters and Getters
        circle1.setCenter(new MyPoint(11, 12));
        circle1.setRadius(13);
        System.out.println(circle1);
        System.out.println("Center is: " + circle1.getCenter());
        System.out.println("Radius is: " + circle1.getRadius());
        circle1.setCenterX(21);
        circle1.setCenterY(22);
        System.out.println("Center's x is: " + circle1.getCenterX());
        System.out.println("Center's y is: " + circle1.getCenterY());
        circle1.setCenterXY(31, 32);
        System.out.println("Center's x is: " + circle1.getCenterXY()[0]);
        System.out.println("Center's y is: " + circle1.getCenterXY()[1]);

        // Test getArea() and getCircumference()
        System.out.printf("Area is: %.2f%n", circle1.getArea());
        System.out.printf("Circumference is: %.2f%n", circle1.getCircumference());
    }
}
