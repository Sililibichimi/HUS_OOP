package oop_hus.lab6.ex4;

public class Square extends Rectangle {
    // Side of square
    private double side;

    // Constructor
    public Square() {
        super();
        side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }
    // Getters and Setters

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    // toString method
    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + side + "]";
    }
}
