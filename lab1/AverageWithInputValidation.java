package oop_hus.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[1];
        int x = 4;
        System.out.println(x ^ x);

    }

    static boolean isTrueInput(int number) {
        return number >= 0 && number <= 100;
    }

    static int[] input(Scanner sc) {

        int[] res = new int[3];
        System.out.print("Enter the mark (0-100) for student" + 1 + " : ");
        int number = sc.nextInt();
        int cnt = -1;
        while (true) {
            if (!isTrueInput(number)) System.out.println("Invalid input, try again ...");
            else {
                ++cnt;
                res[cnt] = number;
                if (cnt == 2) break;
            }
            System.out.print("Enter the mark (0-100) for student" + (cnt + 2) + " : ");
            number = sc.nextInt();
        }
        return res;
    }

    static double calAverage(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }

        return sum * 1.0 / array.length;

    }

}
