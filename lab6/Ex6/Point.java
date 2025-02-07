package oop_hus.lab6.Ex6;

public class Point {
    private int x; // x co-ordinate
    private int y; // y co-ordinate

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // public method

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Point: x = " + x + ", y = " + y;
    }
}
