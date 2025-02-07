import java.util.Scanner;

public class Factorial {
    public static int CalculateFactorial(int n) {
        int factorial = 1;
        if (n == 0) factorial = 0;
        else
            for (int i = 1; i <= n; ++i) {
                factorial *= i;
            }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CalculateFactorial(n));
    }
}
