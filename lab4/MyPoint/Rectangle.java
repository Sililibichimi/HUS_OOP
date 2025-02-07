package oop_hus.lab4.MyPoint;

public class Rectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public Rectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public String toString() {
        return "Rectangle[(" + topLeft.getX() + "," + topLeft.getY() + "),(" + bottomRight.getX() + "," + bottomRight.getY() + ")]";
    }

    public double getArea() {
        return (topLeft.getX() - bottomRight.getX()) * (topLeft.getY() - bottomRight.getY());
    }

    public double getPerimeter() {
        return 2 * ((topLeft.getX() - bottomRight.getX()) + (topLeft.getY() - bottomRight.getY()));
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setTopLeft(int x, int y) {
        this.topLeft = new MyPoint(x, y);
    }

    public void setBottomRight(int x, int y) {
        this.bottomRight = new MyPoint(x, y);
    }
}
