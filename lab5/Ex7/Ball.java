package oop_hus.lab5.Ex7;

public class Ball {
    // the centrer of the ball (x, y)
    private float x;
    private float y;
    private float z;
    // the radius of the ball
    private int radius;
    private float xDelta; // the displacement of the ball in the x direction
    private float yDelta;// the displacement of the ball in the y direction
    private float zDelta;// the displacement of the ball in the z direction

    //constructor
    public Ball(float x, float y, float z, int radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    //getters and setters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setSpeed(float xDelta, float yDelta, float zDelta) {
        this.xDelta = xDelta;
        this.yDelta = yDelta;
        this.zDelta = zDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public void reflectDepth() {
        zDelta = -zDelta;
    }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ", " + z + ") of radius " + radius;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
        z += zDelta;
    }
}
