package oop_hus.lab7.ex1_3;

import oop_hus.lab7.ex1_4.MovableCircle;

public class TestMovable {
    public static void main(String[] args) {
        // Test MovablePoint
        MovablePoint m1 = new MovablePoint(6, 9, 9, 6);
        System.out.println(m1);
        // Test move
        for (int i = 0; i < 100; ++i) {
            if (i % 4 == 0) m1.moveUp();
            if (i % 4 == 1) m1.moveRight();
            if (i % 4 == 2) m1.moveDown();
            if (i % 4 == 3) m1.moveLeft();
            System.out.println(m1);
        }
        // Test MovableCircle
        int radius = 10;
        int xSpeed = 5;
        int ySpeed = 2;
        MovableCircle m2 = new MovableCircle(200, -200, xSpeed, ySpeed, radius);
        m2.moveDown();
        m2.moveLeft();
        m2.moveUp();
        m2.moveRight();
    }
}
