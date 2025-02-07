package oop_hus.lab7.Ex1_8;

public class MovableCircle implements Movable {
    private final int radius; // radius of the circle
    private final MovablePoint center; // center of the circle

    //Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    // toString method
    @Override
    public String toString() {
        return "MovableCircle[" +
                "radius=" + radius +
                ", center=" + center +
                ']';
    }
}
