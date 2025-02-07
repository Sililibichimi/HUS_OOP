package oop_hus.lab11.decorator.ex1;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.print(" color red");
    }

    private void setRedBorder() {

    }
}