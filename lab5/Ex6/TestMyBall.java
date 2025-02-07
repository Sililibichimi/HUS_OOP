package oop_hus.lab5.Ex6;

public class TestMyBall {

    public static void main(String[] args) {
        Ball ball = new Ball(1, 1, 2, 3, 30);
        System.out.println(ball);
        ball.setX(32);
        ball.setY(32);
        ball.setXDelta(3);
        ball.setYDelta(3);
        System.out.println(ball);
        ball.move();
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball.getXDelta());
        System.out.println(ball.getYDelta());
        System.out.println(ball.getRadius());
        ball.reflectHorizontal();
        ball.reflectVertical();
    }

}
