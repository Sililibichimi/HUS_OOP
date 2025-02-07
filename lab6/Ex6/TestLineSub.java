package oop_hus.lab6.Ex6;

public class TestLineSub {
    public static void main(String[] args) {

        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        Point begin = new Point(1, 2);
        Point end = new Point(3, 4);
        LineSub l2 = new LineSub(begin, end);
        System.out.println(l2);

        l2.setBegin(new Point(5, 6));
        l2.setEnd(new Point(7, 8));
        System.out.println(l2);

        l2.setBegin(new Point(5, 6));
        l2.setEnd(new Point(7, 8));
        System.out.println(l2);
        System.out.println("The length of the line is: " + l2.getLength());
        System.out.println("The gradient of the line is: " + l2.getGradient());
    }
}
