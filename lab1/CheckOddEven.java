package oop_hus.lab1;

import java.util.Scanner;

public class CheckOddEven {

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isOdd(number)) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }

        System.out.println("Bye");

    }

}
