package oop_hus.lab4.MyComplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex c1 = new MyComplex(sc.nextDouble(), sc.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex c2 = new MyComplex(sc.nextDouble(), sc.nextDouble());

        // magnitude
        System.out.println("Magnitude of " + c1 + " is " + c1.magnitude());
        //argument
        System.out.println("Argument of " + c1 + " is " + c1.argument());
        // conjugate
        System.out.println("Conjugate of " + c1 + " is " + c1.conjugate());
        // addNew
        MyComplex c3 = c1.addNew(c2);
        System.out.println(c1 + "+" + c2 + " = " + c3);
        // subtractNew
        MyComplex c4 = c1.subtractNew(c2);
        System.out.println(c1 + "-" + c2 + " = " + c4);
        // multiply
        MyComplex c5 = c1.multiply(c2);
        System.out.println(c1 + "*" + c2 + "=" + c5);
        // divide
        MyComplex c6 = c1.divide(c2);
        System.out.println(c1 + "/" + c2 + "=" + c6);
        sc.close();
    }
}
