package oop_hus.btl4;

import java.util.Scanner;

public class NumberTheory {

    public static void main(String[] args) {
//        perfectNumberList();
//         primeList();
//        perfectPrimeFactorList();
//        testGCD();
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                sum += i;
                if (i != aPosInt / i) {
                    sum += aPosInt / i;
                }
            }
        }
        return sum == aPosInt;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                sum += i;
                if (i != aPosInt / i) {
                    sum += aPosInt / i;
                }
            }
        }
        return sum < aPosInt;
    }

    public static void perfectNumberList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        int cntNumberOfPerfect = 0;
        System.out.println("These numbers are perfect: ");
        for (int i = 6; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                cntNumberOfPerfect++;
            }
        }
        System.out.printf("\n[" + cntNumberOfPerfect + " perfect numbers found(%.2f%%)]\n", (float) cntNumberOfPerfect / upperBound * 100);

        int cntNumberOfDeficient = 0;
        System.out.print("The number of are nethier deficient nor perfect: ");
        for (int i = 1; i <= upperBound; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
                System.out.print(i + " ");
                ++cntNumberOfDeficient;
            }
        }
        System.out.printf("\n[" + cntNumberOfDeficient + " numbers found(%.2f%%)]\n", (float) cntNumberOfDeficient / upperBound * 100);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        int cntNumberOfPrime = 0;
        System.out.println("These numbers are prime: ");
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                cntNumberOfPrime++;
            }
        }
        System.out.printf("\n[" + cntNumberOfPrime + " prime+s found(%.2f%%)]\n", (float) cntNumberOfPrime / upperBound * 100);
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int factor = 1;
        for (int i = 2; i < Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                if (isPrime(i)) {
                    factor *= i;
                }
                if (isPrime(aPosInt / i)) {
                    factor *= (aPosInt / i);
                }
            }
        }
        return factor == aPosInt;
    }

    public static void perfectPrimeFactorList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        int cntNumberOfPerfect = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 6; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                cntNumberOfPerfect++;
            }
        }
        System.out.printf("\n[" + cntNumberOfPerfect + " numbers found(%.2f%%)]\n", (float) cntNumberOfPerfect / upperBound * 100);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void testGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
