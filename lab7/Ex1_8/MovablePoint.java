package oop_hus.lab7.Ex1_8;

public class MovablePoint implements Movable {
    private int x; // x coordinate
    private int y; // y coordinate
    private final int xSpeed; // horizontal speed
    private final int ySpeed; // vertical speed

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        y -= ySpeed; // y-axis is directed down for 2D graphics
    }

    @Override
    public void moveDown() {
        y += ySpeed; // y-axis is directed down for 2D graphics
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // x-axis is directed to the right for 2D graphics
    }

    @Override
    public void moveRight() {
        x += xSpeed; // x-axis is directed to the right for 2D graphics
    }
}
