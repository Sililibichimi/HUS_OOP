package oop_hus.lab5.Ex1;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex c1 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex c2 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.println();

        System.out.println("Number 1 is: " + c1);
        System.out.println(c1 + " is " + (c1.isReal() ? "a pure real" : "NOT a pure real") + " number");
        System.out.println(c1 + " is " + (c1.isImaginary() ? "a pure imaginary" : "NOT a pure imaginary") + " number\n");

        System.out.println("Number 2 is: " + c2);
        System.out.println(c2 + " is " + (c2.isReal() ? "a pure real" : "NOT a pure real") + " number");
        System.out.println(c2 + " is " + (c2.isImaginary() ? "a pure imaginary" : "NOT a pure imaginary") + " number\n");

        System.out.println(c1 + " is " + (c1.equals(c2) ? "equal to" : "NOT equal to") + " " + c2);
        System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
    }
}
