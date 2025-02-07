import java.util.Scanner;

public class SumProDuctMinMax3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println("The sum is " + calculateSum(number1, number2, number3));
        System.out.println("The product is : " + calculateProduct(number1, number2, number3));
        System.out.println("The min is " + findMin(number1, number2, number3));
        System.out.println("The max is " + findMax(number1, number2, number3));
    }

    static int calculateSum(int number1, int number2, int number3) {

        return number1 + number2 + number3;

    }

    static int calculateProduct(int number1, int number2, int number3) {

        return number1 * number2 * number3;

    }

    static int findMax(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number3) return number1;
        if (number2 > number3) return number2;
        return number3;

    }

    static int findMin(int number1, int number2, int number3) {

        if (number1 < number2 && number1 < number3) return number1;
        if (number2 < number3) return number2;
        return number3;

    }
}
