import java.util.Scanner;

public class CircleComputation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double diameter = radius * 2;


    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    static double calculateVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }

}
