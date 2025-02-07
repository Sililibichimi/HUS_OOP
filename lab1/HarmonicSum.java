import java.util.Scanner;

public class HarmonicSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sumL2R = calculateHarmonicSumLeftToRight(n);
        double sumR2L = calculateHarmonicSumRightToLeft(n);

        System.out.println("The sum from left to right " + sumL2R);
        System.out.println("The sum from right to left " + sumL2R);
        if (sumL2R > sumR2L) {
            System.out.println("SumR2L is more accurate");
        } else if (sumL2R < sumR2L) {
            System.out.println("SumL2R is more accurate");
        } else {
            System.out.println("Equals");
        }

    }

    static double calculateHarmonicSumLeftToRight(int n) {
        double res = 0;

        for (int i = 1; i <= n; ++i) {
            res += 1.0 / i;
        }

        return res;
    }

    static double calculateHarmonicSumRightToLeft(int n) {
        double res = 0;

        for (int i = n; i >= 1; --i) {
            res += 1.0 / i;
        }

        return res;
    }
}
