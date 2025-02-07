package oop_hus.lab7.Ex1_8;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(2, 1, 2, 3, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        // Test MovableRectangle
        Movable m3 = new MovableRectangle(1, 2, 3, 4, 1, 1);
        System.out.println(m3);
        m3.moveUp();
        m3.moveDown();
        m3.moveLeft();
        m3.moveRight();
        System.out.println(m3);
    }

    // The difference between an interface and an abstract class is :
    // An interface can only have abstract methods (expect default and static method)
    // while an abstract class can have both abstract and non-abstract methods.
    // An interface doesn't have constructors
    // while an abstract class can have constructors.
    // An interface can extend multiple interfaces
    // while an abstract class can extend only one class or one abstract class at a time.

}
