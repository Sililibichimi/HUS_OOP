package oop_hus.lab4.MyComplex;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Test constructor
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex c1 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex c2 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        // isReal, isImaginary
        System.out.println("Number 1 is : " + c1);
        System.out.println("Number 1 is " + (c1.isReal() ? "is a pure real number" : "is NOT a pure real number"));
        System.out.println("Number 1 is " + (c1.isImaginary() ? "is a pure imaginary number" : "is NOT a pure imaginary number"));
        System.out.println();
        System.out.println("Number 2 is : " + c2);
        System.out.println("Number 2 is real? " + (c2.isReal() ? "is a pure real number" : "is NOT a pure real number"));
        System.out.println("Number 2 is imaginary? " + (c2.isImaginary() ? "is a pure imaginary number" : "is NOT a pure imaginary number"));
        System.out.println();
        // equals
        System.out.println(c1 + (c1.equals(c2) ? "is equal to" : "is NOT equal to") + c2);
        //addNew
        System.out.println(c1 + " + " + c2 + " = " + c1.addNew(c2));
    }
}
