package oop_hus.lab7.ex1_1;

public class Square extends Rectangle {
    // Default constructor
    public Square() {
        super();
    }

    // Parameterized constructor
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and setter
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    // toString method
    @Override
    public String toString() {
        return "Square[" + super.toString() + ", side=" + getSide() + "]";
    }
}
