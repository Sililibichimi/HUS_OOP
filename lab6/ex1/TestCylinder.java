package oop_hus.lab6.ex1;

public class TestCylinder {

    public static void main(String[] args) {
        // A Cylinder with default color, radius and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " Radius: " + c1.getRadius()
                + " Height: " + c1.getHeight()
                + " Color: " + c1.getColor()
                + " Base Area: " + c1.getArea()
                + " Volume: " + c1.getVolume());

        // A Cylinder with default color and height, but radius is 5.0
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                + " Radius: " + c2.getRadius()
                + " Height: " + c2.getHeight()
                + " Color: " + c2.getColor()
                + " Volume: " + c2.getVolume());

        // A Cylinder with default color, radius is 5.0 and height is 10.0
        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder:"
                + " Radius: " + c3.getRadius()
                + " Height: " + c3.getHeight()
                + " Color: " + c3.getColor()
                + " Volume: " + c3.getVolume());

        // A Cylinder with radius is 5.0, height is 10.0 and color is blue
        Cylinder c4 = new Cylinder(5.0, 10.0, "blue");
        System.out.println("Cylinder:"
                + " Radius: " + c4.getRadius()
                + " Height: " + c4.getHeight()
                + " Color: " + c4.getColor()
                + " Volume: " + c4.getVolume());

        Circle c5 = new Cylinder(5.0, 10.0, "blue");
        System.out.println(c5);
    }

}
