package oop_hus.lab2;

import java.util.Scanner;

public class StringAndCharacterExercise {

    public static void main(String[] args) {
        //testReverseString();
        //testCountVowelsDigits();
        //testPhoneKyePad();
//        testCipherCaesarCode();
        //testDecipherCaesarCode();
        //testHexString();
//        testBinary();
//        testHexadecimalToDeimal();
        //testOctalToDecimal();
//        testRadixNToDecimal();
    }

    // 1.1 ReverseString
    static String reverseString(String inStr) {
        String resStr = "";
        for (int i = inStr.length() - 1; i >= 0; --i) {
            resStr += inStr.charAt(i);
        }
        return resStr;
    }

    static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("The reverse of the  string \"" + str + "\" is \"" + reverseString(str) + "\"");
    }

    //CntVowelsDigits

    static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int numberDigits = countDigits(str);
        int numberVowels = countVowels(str);
        System.out.println("Number of vowels : " + numberVowels + " (" + Math.round(numberVowels * 1.0 / str.length() * 100.0) + "%)");
        System.out.println("Number of digits : " + numberDigits + " (" + Math.round(numberDigits * 1.0 / str.length() * 100.0) + "%)");

    }

    static int countVowels(String inStr) {
        int cntVowels = 0;
        inStr = inStr.toLowerCase();
        for (int i = 0; i < inStr.length(); ++i) {
            char x = inStr.charAt(i);
            if (x == 'e' || x == 'u' || x == 'o' || x == 'a' || x == 'i') {
                ++cntVowels;
            }
        }
        return cntVowels;
    }

    static int countDigits(String inStr) {
        int cntDigits = 0;
        for (int i = 0; i < inStr.length(); ++i) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
                cntDigits++;
            }
        }
        return cntDigits;
    }

    //PhoneKeyPad
    static String phoneKeyPad(String inStr) {
        inStr = inStr.toLowerCase();
        String res = "";
        for (int i = 0; i < inStr.length(); ++i) {
            char x = inStr.charAt(i);
            if ('a' <= x && x <= 'c') res += '2';
            else if (x <= 'f') res += '3';
            else if (x <= 'i') res += '4';
            else if (x <= 'l') res += '5';
            else if (x <= 'o') res += '6';
            else if (x <= 's') res += '7';
            else if (x <= 'v') res += '8';
            else if (x <= 'z') res += '9';
        }
        return res;
    }

    static void testPhoneKyePad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        String str = sc.nextLine();
        System.out.println("The cipher textstring is :" + phoneKeyPad(str));
    }

    //1.4 Caesar's code
    static String cipherCaesarCode(String inStr) {
        inStr = inStr.toUpperCase();
        String res = "";
        for (int i = 0; i < inStr.length(); ++i) {
            if (inStr.charAt(i) + 3 <= 'Z') res += (char) (inStr.charAt(i) + 3);
            else res += (char) (inStr.charAt(i) % 26);
        }
        return res;
    }

    static void testCipherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        String str = sc.nextLine();
        System.out.println("The ciphertext string is : " + cipherCaesarCode(str));
    }

    // 1.5 decipher caesar's code
    static String decipherCaedarCode(String inStr) {
        inStr = inStr.toUpperCase();
        String res = "";
        for (int i = 0; i < inStr.length(); ++i) {
            if (inStr.charAt(i) - 3 >= 'A') res += (char) (inStr.charAt(i) - 3);
            else res += (char) (inStr.charAt(i) + 23);
        }
        return res;
    }

    static void testDecipherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string : ");
        String str = sc.nextLine();
        System.out.println("The plaintext string is : " + decipherCaedarCode(str));
    }

    // 1.6 CheckHexString
    static boolean isHexString(String hexStr) {
        hexStr = hexStr.toLowerCase();
        for (int i = 0; i < hexStr.length(); ++i) {
            char temp = hexStr.charAt(i);
            if ((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'f')) continue;
            else return false;
        }
        return true;
    }

    static void testHexString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string : ");
        String str = sc.nextLine();
        System.out.println(str + (isHexString(str) ? "is a hex string" : "is NOT a hex string"));
    }

    // 1.7 BinaryToDecimal
    static int binaryToDecimal(String binStr) {
        int res = 0;
        for (int i = 0; i < binStr.length(); ++i) {
            if (binStr.charAt(i) != '0' && binStr.charAt(i) != '1') {
                return -1;
            } else res = res * 2 + (binStr.charAt(i) - '0');
        }
        return res;
    }

    static void testBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary String ");
        String str = sc.nextLine();
        int decimal = binaryToDecimal(str);
        if (decimal == -1) {
            System.out.println("error : invalid binary string \"" + str + "\"");
        } else {
            System.out.println("The equivalent deciamal number for binary \"" + str + "\" is : " + decimal);
        }
    }

    // 1.8 HexadecimalToDecimal
    static int hexdecimalToDecimaḷ̣̣̣̣(String hexStr) {
        hexStr = hexStr.toLowerCase();
        int res = 0;
        if (!isHexString(hexStr)) return -1;
        for (int i = 0; i < hexStr.length(); ++i) {
            if (hexStr.charAt(i) <= 'f' && hexStr.charAt(i) >= 'a') {
                res = res * 16 + (hexStr.charAt(i) - 'a' + 10);
            } else {
                res = res * 16 + (hexStr.charAt(i) - '0');
            }
        }
        return res;
    }

    static void testHexadecimalToDeimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal String : ");
        String str = sc.nextLine();
        if (!isHexString(str)) {
            System.out.println("error : invalid hexadecimal string \"" + str + "\"");
            return;
        }
        System.out.println("The equivalent decimal number for binary \"" + str + "\" is : " + hexdecimalToDecimaḷ̣̣̣̣(str));
    }

    // 1.9 OctalToDecimal
    static int octalToDecimal(String octalStr) {
        octalStr = octalStr.toLowerCase();
        int res = 0;
        for (int i = 0; i < octalStr.length(); ++i) {
            char x = octalStr.charAt(i);
            if (x >= '0' && x <= '7') res = res * 8 + (x - '0');
            else return -1;
        }
        return res;
    }

    static void testOctalToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal String : ");
        String str = sc.nextLine();
        if (octalToDecimal(str) == -1) {
            System.out.println("error : invalid  string \"" + str + "\"");
            return;
        }
        System.out.println("The equivalent decimal number \"" + str + "\" is : " + octalToDecimal(str));
    }

    // 1.10 RadixNToDecimal
    static int radixNToDecimal(String radixNStr, String str) {
        str = str.toLowerCase();
        int res = 0;
        int radix = Integer.parseInt(radixNStr);
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) <= 'f' && str.charAt(i) >= 'a') {
                res = res * radix + (str.charAt(i) - 'a' + 10);
            } else {
                res = res * radix + (str.charAt(i) - '0');
            }
        }
        return res;
    }

    static void testRadixNToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix : ");
        String radix = sc.nextLine();
        System.out.print("Enter an string : ");
        String str = sc.nextLine();
        System.out.println("The equivalent decimal number \"" + str + "\" is :" + radixNToDecimal(radix, str));
    }

}
