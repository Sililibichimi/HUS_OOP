package oop_hus.lab6.Ex6;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point begin = new Point(1, 2);
        Point end = new Point(3, 4);
        Line l2 = new Line(begin, end);
        System.out.println(l2);

        l2.setBegin(new Point(5, 6));
        l2.setEnd(new Point(7, 8));
        System.out.println(l2);
        System.out.println("The length of the line is: " + l2.getLength());
        System.out.println("The gradient of the line is: " + l2.getGradient());
    }
}
