package oop_hus.lab5.ex2;

public class TestMypolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(-1.1, 0, -1.1, 2.2, 3.3, 0, 0, 1, 0, 0, 0);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println("The degree of p1 is " + p1.getDegree());
        System.out.println("The first polynomial is " + p1);
        System.out.println(p1.add(p2));
        System.out.println(p1.evaluate(2));
    }
}
