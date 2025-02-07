package oop_hus.lab4.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test constructors and public methods
        MyTriangle t1 = new MyTriangle(0, 0, 0, 4, 0, 5);
        System.out.println(t1);
        System.out.println("Type is: " + t1.getType());

        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(3, 4);
        MyPoint v3 = new MyPoint(5, 6);

        MyTriangle t2 = new MyTriangle(v1, v2, v3);
        System.out.println(t2);
        System.out.println("Perimeter is: " + t2.getPerimeter());
        System.out.println("Type is: " + t2.getType());
    }
}
