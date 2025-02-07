package oop_hus.lab2;

import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printArray(createArray(sc));
        //simpleGradesStatistics();
        testDecimalToHexadecimal();
    }

    // 2.1 PrintArray
    static int[] createArray(Scanner in) {
        System.out.print("Enter the number of items :");
        int NUM_ITEMS = Integer.parseInt(in.nextLine());
        System.out.print("Enter the value of all items(separated by sapce : ");
        int[] arr = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; ++i) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        System.out.print("The values are : [");
        for (int i = 0; i < arr.length - 1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }

    // 2.2 GradesStatics
    static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students ");
        int numStudents = Integer.parseInt(in.nextLine());
        int[] students = new int[numStudents];
        for (int i = 0; i < numStudents; ++i) {
            System.out.print("Enter the grade for student " + (i + 1) + " : ");
            students[i] = Integer.parseInt(in.nextLine());
        }
        return students;
    }

    static void simpleGradesStatistics() {
        Scanner sc = new Scanner(System.in);
        int[] arr = generateStudentGrade(sc);
        int sum = arr[0];
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) max = arr[i];
            sum += arr[i];
        }
        System.out.println("The average is : " + (sum * 1.0 / arr.length));
        System.out.println("The minimum is : " + min);
        System.out.println("The maximum is : " + max);
    }

    // 2.3 HexadecimalToBinary
    static String hexadecimalToBinary(String hexStr) {
        String[] hexBits = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String res = "";
        hexStr = hexStr.toLowerCase();
        for (int i = 0; i < hexStr.length(); ++i) {
            if (hexStr.charAt(i) >= '0' && hexStr.charAt(i) <= '9') res += hexBits[hexStr.charAt(i) - '0'] + " ";
            else res += hexBits[hexStr.charAt(i) - 'a' + 10] + " ";
        }
        return res;
    }

    static void testHexadecimalToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal String : ");
        String str = sc.nextLine();
        System.out.println("The equivalent binary for hexadecimal \"" + str + "\" is " + hexadecimalToBinary(str));
    }

    //2.4 DecimalToHexadicimal
    static String decimalToHexadecimal(int positiveInteger) {
        char[] hexArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String result = "";
        while (positiveInteger > 0) {
            result = hexArr[positiveInteger % 16] + result;
            positiveInteger = positiveInteger / 16;
        }
        return result;
    }

    static void testDecimalToHexadecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        System.out.println("The equivalent hexadecimal number is :" + decimalToHexadecimal(decimal));
    }

}
