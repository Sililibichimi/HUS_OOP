import java.util.Scanner;

public class ExtractDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The result is : " + extractDigits(n));
    }

    static int extractDigits(int number) {

        int res = 0;

        while (number > 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }
        return res;
    }

}
