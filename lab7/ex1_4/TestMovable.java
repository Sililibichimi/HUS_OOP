package oop_hus.lab7.ex1_4;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(6, 9, 6, 9);
        System.out.println(m1);
        m1.moveLeft();
        for (int i = 0; i < 100; ++i) {
            if (i % 10 == 0) m1.moveLeft();
            else if (i % 6 == 0) m1.moveDown();
            else if (i % 9 == 0) m1.moveRight();
            else m1.moveUp();
            System.out.println(m1);
        }
    }
}
