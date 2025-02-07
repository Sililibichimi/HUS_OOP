package oop_hus.lab3;

import java.util.Scanner;

public class StringAndCharacterHomework {

    public static void main(String[] args) {
        //testExchangeCipher();
        //testIsPalindrome();
        testIsPalindromicPharse();
    }

    static void testExchangeCipher() {
        System.out.print("Enter a plaintext string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println("The cipher string is : " + exchangeCipher(str));
    }

    static String exchangeCipher() {
        return "";
    }

    static String exchangeCipher(String inStr) {
        String result = "";
        for (int i = 0; i < inStr.length(); ++i) {
            int temp;
            if (inStr.charAt(i) - 'A' < 'Z' / 2) {
                temp = inStr.charAt(i) - 'Z' / 2 - 'A';
                result += (char) ('Z' / 2 - temp);
            } else {
                temp = inStr.charAt(i) - 'A';
                result += (char) ('Z' / 2 + temp);
            }
        }
        return result;
    }

    static boolean isPalindrome(String str) {
        int len = str.length() - 1;
        for (int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(len - i)) {
                return false;
            }
        }
        return true;
    }

    static void testIsPalindrome() {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The string is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
    }

    static boolean isPalindromicPharse(String str) {
        str = str.toUpperCase();
        String temp = "";
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                temp += str.charAt(i);
            }
        }
        return isPalindrome(temp);
    }

    static void testIsPalindromicPharse() {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The string is " + (isPalindromicPharse(str) ? "a palindromic phrase" : "not a palindromic phrase"));
    }
}
