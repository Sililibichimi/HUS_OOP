package oop_hus.btl4;

import java.util.Scanner;

public class ExercisesOnRecursion {

    public static void main(String[] args) {
//        testFactorial();
//        testFibonacci();
//        testLength();
        testGCD();
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void testFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int fibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void testFibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }

    public static int leng(int number) {
        if (number == 1) {
            return 1;
        }
        return leng(number - 1) + lengthOfDigits(number);
    }

    public static int lengthOfDigits(int number) {
        if (number < 10) {
            return 1;
        }
        return 1 + lengthOfDigits(number / 10);
    }

    public static void testLength() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Length of S(" + n + ") is " + leng(n));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (b > a) return gcd(a, b - a);
        else return gcd(b, a - b);
    }

    public static void testGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
