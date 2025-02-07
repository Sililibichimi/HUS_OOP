package oop_hus.lab2;

import java.util.Scanner;

public class MethodExcercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //testExponent();
        //System.out.println(hasEight(10));
        //testMagicSum(sc);
        //testArrayToString();
        //testContains();
        //testSearch();
        //testEquals();
        //testCopyOf();
        //testSwap();
        testReverse();
    }

    //3.1 exponent()
    public static int exponent(int base, int exp) {

        if (exp == 1) return base;
        else if (exp == 0) return 1;
        else {
            int x = exponent(base, exp / 2);
            if (exp % 2 == 0) {
                return x * x;
            } else {
                return x * x * base;
            }
        }
    }

    static void testExponent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the exponent ");
        int exp = Integer.parseInt(sc.nextLine());
        System.out.println(base + " raises to the power of " + exp + " is : " + exponent(base, exp));
    }

    //3.2 hasEight()
    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) return true;
            number /= 10;
        }
        return false;
    }

    static void testMagicSum(Scanner in) {
        int sum = 0;
        int endNumber = -1;
        int number;
        System.out.print("Enter a positive integer (or -1 to endNumber): ");
        number = in.nextInt();
        while (number != endNumber) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a positive integer (or -1 to endNumber): ");
            number = in.nextInt();
        }
        System.out.print("The magic sum is: " + sum);
    }

    //3.3 print()
    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    static void print(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    static void print(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    // 3.4 arrayToString()
    static void testPrint() {
        int[] arr = {31231, 2342, 22, 43287, 533};
        float[] arr1 = {33.1f, 232.32f, 3978.30009f, 4878.432f, 8998.548f};
        double[] arr2 = {3238.1423, 9886.54, 98.34};
        int[] arr3 = {};
        print(arr);
        print(arr1);
        print(arr2);
        print(arr3);
    }

    //3.4 ArrayToString

    static String arrayToString(int[] arr) {
        String res = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + ",";
        }
        res += arr[arr.length - 1] + "]";
        return res;
    }

    static void testArrayToString() {
        int[] arr = {3214, 543, 532, 43267, 31};
        System.out.println(arrayToString(arr));
    }

    //3.5 Contain()
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    static void testContains() {
        int[] arr = {8932, 433, 3434, 434, 532, 32, 39090, 4321};
        System.out.println(contains(arr, 4321));
        System.out.println(contains(arr, 6324534));
    }

    // Search()
    static int equals(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void testSearch() {
        int[] arr = {8932, 433, 3434, 434, 532, 32, 39090, 4321};
        System.out.println(equals(arr, 4321));
        System.out.println(equals(arr, 6324534));
    }

    // 3.7 equals()
    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void testEquals() {
        int[] arr1 = {8932, 433, 3434, 434, 532, 32, 39090, 4321};
        int[] arr2 = {8932, 433, 3434, 434, 532, 32, 39090, 4321};
        int[] arr3 = {312, 32, 3124, 32};
        System.out.println(equals(arr1, arr2));
        System.out.println(equals(arr1, arr3));
    }

    //3.8 copyOf()
    public static int[] copyOf(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] res = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < arr.length) res[i] = arr[i];
            else res[i] = 0;
        }
        return res;
    }

    static void testCopyOf() {
        int[] arr = {56789, 6543, 424};

        print(copyOf(arr));
        print(copyOf(arr, 10));
    }

    //3.9 Swap()
    static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    static void testSwap() {
        int[] arr1 = {43, 232, 33};
        int[] arr2 = {6, 7, 8, 9, 10};
        swap(arr1, arr2);
    }

    //3.10 reverse()
    static int[] reverse(int[] arr) {
        int d = 0, c = arr.length - 1;
        while (d < c) {
            int temp = arr[d];
            arr[d] = arr[c];
            arr[c] = temp;
            ++d;
            --c;
        }
        return arr;
    }

    static void testReverse() {
        int[] arr = {763, 434, 432, 32, 33, 32989, 19903};
        print(reverse(arr));
    }
}
