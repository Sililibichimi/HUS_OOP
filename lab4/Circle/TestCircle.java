package oop_hus.lab4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

//        Circle circle3 = new Circle(-1.0);
//        System.out.println("The circle has radius of " + circle3.radius);
//        Không thể truy cập được biến radius vì nó là private

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius()); // Print radius via getter

        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor()); // Print color via getter

//        You cannot do the following because setRadius() returns void
//        which cannot be printed
//        System.out.println(circle4.setRadius(4.4);

        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());  // Explicitly call toString()

        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());  // println() calls toString() implicitly, same as above
        System.out.println(circle6);  // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + circle6);  // '+' invokes toString() too
    }
}
