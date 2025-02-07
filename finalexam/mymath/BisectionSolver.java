package oop_hus.finalexam.mymath;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        double left = lower;
        double right = upper;

        for(int i = 0; i < maxIterations; i++) {
            double mid = (left + right) / 2;
            double yLeft = function.evaluate(left);
            double yMid = function.evaluate(mid);

            if(yMid == 0 || (right - left) / 2 < tolerance) {
                return mid;
            }

            if(yLeft * yMid < 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return (left + right) / 2;
    }
}
