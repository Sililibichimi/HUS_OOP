package oop_hus.finalexam.mymath;

public class MyMath {
    public static int limit = 100;
    public static double sin(double x) {
        double result = 0;
        double temp = x;
        int sign = 1;
        for(int i = 1; i < limit; i++) {
            result += sign * temp;
            sign *= -1;
            temp *= x * x / ((2 * i) * (2 * i + 1));
        }
        return result;
    }

    public static double cos(double x) {
        double result = 0;
        double temp = 1;
        int sign = 1;
        int fact = 1;
        for(int i = 0; i < limit; i++) {
            result += sign * temp;
            sign *= -1;
            temp *= x * x / ((2 * i + 1) * (2 * i + 2)) ;
        }
        return result;
    }

    public double exp(double x) {
        double result = 0;
        double temp = 1;
        int fact = 1;
        for(int i = 0; i < limit; i++) {
            result += temp;
            temp *= x / (i + 1);
        }
        return result;
    }

    public double ln(double x) {
        double result = 0;
        double temp = x - 1;
        int sign = 1;
        for(int i = 1; i < limit; i++) {
            result += sign * temp;
            sign *= -1;
            temp *= (x - 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MyMath.cos(10) + " " +  Math.cos(10));
    }
}
