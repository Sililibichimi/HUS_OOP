package oop_hus.finalexam.mymath;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double x0 = lower;
        double x1 = upper;
        double x2 = x1 - function.evaluate(x1) * (x1 - x0) / (function.evaluate(x1) - function.evaluate(x0));
        int i = 0;
        while (Math.abs(x2 - x1) > tolerance && i < maxIterations) {
            x0 = x1;
            x1 = x2;
            x2 = x1 - function.evaluate(x1) * (x1 - x0) / (function.evaluate(x1) - function.evaluate(x0));
            i++;
        }
        return x2;
    }
}
