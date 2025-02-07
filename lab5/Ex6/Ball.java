package oop_hus.lab5.Ex6;

public class Ball {
    // the centrer of the ball (x, y)
    private float x;
    private float y;
    // the radius of the ball
    private int radius;
    // the displacement of the ball(moverment) per step (speed of the ball)
    private float xDelta; // the displacement of the ball in the x direction
    private float yDelta;// the displacement of the ball in the y direction

    // Constructor
    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
        this.yDelta = (float) (-speed * Math.sin(Math.toRadians(direction)));
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Move the ball
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Reflect the direction of the ball
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + "), speed = (" + xDelta + ", " + yDelta + ")]";
    }


}
