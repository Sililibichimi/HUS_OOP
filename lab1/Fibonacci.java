import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] fibo = calculateFibo(n);
        printFibo(fibo);
        System.out.println();
        System.out.println("The average is " + calculateAverage(fibo));

    }

    static int[] calculateFibo(int n) {

        int[] res = new int[n];
        if (n >= 0) res[0] = 1;
        else return res;
        if (n >= 1) res[1] = 1;
        else return res;
        System.out.println();
        for (int i = 2; i < n; ++i) {
            res[i] = res[i - 2] + res[i - 1];
        }
        return res;
    }

    static void printFibo(int[] fiboArray) {

        System.out.println("The first " + fiboArray.length + " Fibonacci numbers are :");
        for (int i = 0; i < fiboArray.length; ++i) {
            System.out.print(fiboArray[i] + " ");
        }

    }

    static double calculateAverage(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }

        return sum * 1.0 / array.length;

    }

}
