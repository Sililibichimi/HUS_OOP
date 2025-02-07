package oop_hus.lab7.ex1_5;

public class ResizableCircle extends Circle implements Resizable {
    // Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    // toString method
    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    // Implement the resize method
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }
}
