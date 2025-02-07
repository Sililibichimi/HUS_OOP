package oop_hus.lab6.Ex7;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Circle base = new Circle(12, "blue");
        c1.setBase(base);
        c1.setHeight(10);
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        Cylinder c2 = new Cylinder(5.0, 2.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
    }
}
