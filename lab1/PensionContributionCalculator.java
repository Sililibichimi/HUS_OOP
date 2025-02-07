import java.text.DecimalFormat;
import java.util.Scanner;

public class PensionContributionCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int age = sc.nextInt();

        printf(salary, age);
    }

    static void printf(int salary, int age) {

        double contributionOfEmployee = calculateContributionOfEmployee(salary, age);
        double contributionOfEmployer = calculateContributionOfEmployer(salary, age);
        System.out.println("The employee’s contribution is " + Math.round(contributionOfEmployee * 1000) / 1000.00);
        System.out.println("The employer’s contribution is " + Math.round(contributionOfEmployer * 1000) / 1000.00);
        System.out.println("The total contribution is " + (calSumOfContribution(contributionOfEmployee, contributionOfEmployer)));

    }

    static double calculateContributionOfEmployee(int salary, int age) {

        double[] rate = {20, 13, 7.5, 5};

        if (age <= 55) return rate[0] / 100.0 * salary;
        if (age <= 60) return rate[1] / 100.0 * salary;
        if (age <= 65) return rate[2] / 100.0 * salary;
        return rate[3] / 100.0 * salary;

    }

    static double calculateContributionOfEmployer(int salary, int age) {
        double[] rate = {17, 13, 9, 7.5};
        if (age <= 55) return rate[0] / 100.0 * salary;
        if (age <= 60) return rate[1] / 100.0 * salary;
        if (age <= 65) return rate[2] / 100.0 * salary;
        return rate[3] / 100.0 * salary;
    }

    static double calSumOfContribution(double contribution1, double contribution2) {

        return contribution1 + contribution2;

    }
}
