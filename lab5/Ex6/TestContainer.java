package oop_hus.lab5.Ex6;

public class TestContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container container = new Container(0, 0, 100, 100);
        for (int i = 0; i < 100; i++) {
            ball.move();
            container.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
