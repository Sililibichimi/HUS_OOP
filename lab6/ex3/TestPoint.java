package oop_hus.lab6.ex3;

public class TestPoint {
    public static void main(String[] args) {
        // Test Point2D
        // A point 2d with default values
        Point2D point2D = new Point2D();
        // Set value for the point
        point2D.setX(3.0f);
        point2D.setY(4.0f);
        System.out.println(point2D);
        System.out.println("x is: " + point2D.getX()
                + " y is: " + point2D.getY());

        // Test Point3D
        // A point 3d with default values
        Point3D point3D = new Point3D();
        // Set value for the point
        point3D.setX(3.0f);
        point3D.setY(4.0f);
        point3D.setZ(5.0f);
        System.out.println(point3D);
        System.out.println("x is: " + point3D.getX()
                + " y is: " + point3D.getY()
                + " z is: " + point3D.getZ());
    }
}
