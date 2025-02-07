package oop_hus.lab7.Ex1_8;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft; // top left corner
    private final MovablePoint bottomRight; // bottom right corner

    // Constructor
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // toString method
    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ']';
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
