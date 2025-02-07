package oop_hus.lab7.ex1_2;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = new GeometricObject[4];
        geometricObjects[0] = new Circle(5);
        geometricObjects[1] = new Circle(10);
        geometricObjects[2] = new Rectangle(5, 10);
        geometricObjects[3] = new Rectangle(10, 20);

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println("Area: " + geometricObject.getArea());
            System.out.println("Perimeter: " + geometricObject.getPerimeter());
            System.out.println();
        }
    }
}
