import java.util.Scanner;

public class SumAverageRunningInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lowerbound = sc.nextInt();
        int upperbound = sc.nextInt();
        int sum = calculateSum(lowerbound, upperbound);
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + calculateAverage(sum, upperbound - lowerbound + 1));

    }

    public static int calculateSum(int lowerbound, int upperbound) {

        int sum = 0;
        for (int i = lowerbound; i <= upperbound; ++i) {
            sum += i;
        }
        return sum;
    }

    public static double calculateAverage(int sum, int numOfElements) {

        return sum * 1.0 / numOfElements;

    }

    public static int calculateSumByWhileDo(int lowerbound, int upperbound) {
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            sum += number;
            ++number;
        }
        return sum;
    }

    public static int calculateSumByDoWhile(int lowerbound, int upperbound) {
        int sum = 0;
        int number = lowerbound;
        do {
            sum += number;
            ++number;
        } while (number <= upperbound);
        return sum;
    }

    public static int calculateSumOfTheSquares(int lowerbound, int upperbound) {
        int res = 0;
        for (int i = lowerbound; i <= upperbound; ++i) {
            res += i * i;
        }
        return res;
    }

    public static int calculateSumOfOddNumbers(int lowerbound, int upperbound) {
        int res = 0;
        for (int i = lowerbound; i <= upperbound; ++i)
            if (i % 2 != 0) {
                res += i;
            }
        return res;
    }

    public static int calculateSumOfEvenNumbers(int lowerbound, int upperbound) {
        int res = 0;
        for (int i = lowerbound; i <= upperbound; ++i)
            if (i % 2 == 0) {
                res += i;
            }
        return res;
    }
}
