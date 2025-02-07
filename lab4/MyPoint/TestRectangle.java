package oop_hus.lab4.MyPoint;

public class TestRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 2);
        MyPoint bottomRight = new MyPoint(3, 4);
        Rectangle rectangle1 = new Rectangle(topLeft, bottomRight);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
