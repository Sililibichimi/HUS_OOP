package oop_hus.lab4.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        // Test constructors and public methods
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);

        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(3, 4);

        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2);
        System.out.println("Begin is: " + line2.getBegin());
        System.out.println("End is: " + line2.getEnd());

        line2.setBegin(new MyPoint(5, 6));
        line2.setEnd(new MyPoint(7, 8));
        System.out.println("Begin's x is: " + line2.getBeginX());
        System.out.println("Begin's y is: " + line2.getBeginY());
        System.out.println("End's x is: " + line2.getEndX());
        System.out.println("End's y is: " + line2.getEndY());
        System.out.println("Begin's xy is: " + line2.getBeginXY()[0] + ", " + line2.getBeginXY()[1]);
        System.out.println("End's xy is: " + line2.getEndXY()[0] + ", " + line2.getEndXY()[1]);
        line2.setBeginXY(9, 10);
        line2.setEndXY(11, 12);
        System.out.println(line2);
    }
}
