package oop_hus.lab7.ex1_5;

public class TestResizableCircle {

    public static void main(String[] args) {
        // declare a circle object
        Circle c = new Circle(5);
        // print the circle object
        System.out.println(c);
        // print the area of the circle object
        System.out.println("Area: " + c.getArea());
        // print the perimeter of the circle object
        System.out.println("Perimeter: " + c.getPerimeter());

        // declare a resizable circle object
        ResizableCircle rc = new ResizableCircle(5);
        // print the resizable circle object
        System.out.println(rc);
        // print the area of the resizable circle object
        System.out.println("Area: " + rc.getArea());
        // print the perimeter of the resizable circle object
        System.out.println("Perimeter: " + rc.getPerimeter());
        // resize the resizable circle object by 69%
        rc.resize(69);
        System.out.println("Area after resizing: " + rc.getArea());
    }

}
