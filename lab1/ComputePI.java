import java.util.Scanner;

public class ComputePI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX_DENOMINATOR = sc.nextInt();
        double PI = calculatePi(MAX_DENOMINATOR);
        System.out.println("The value of pi is " + PI);
    }

    static double calculatePi(int MAX_DENOMINATOR) {

        double pi = 0;
        int tmp = 1;
        for (int i = 1; i <= MAX_DENOMINATOR; i += 2) {
            pi += 1.0 * tmp / i;
            tmp *= -1;
        }
        return 4 * pi;
    }

}
