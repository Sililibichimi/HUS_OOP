package oop_hus.lab4.Circle;

public class TestMain {
    public static void main(String[] args) {
        //Test constructors and toString()
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1); // toString()
        Circle circle2 = new Circle(); //default constructor
        System.out.println(circle2); // toString()
        //Test setter and getter
        circle1.setRadius(2.2);
        System.out.println(circle1); // toString()
        System.out.println("radius is: " + circle1.getRadius());

        //Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
