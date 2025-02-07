package oop_hus.finalexam.mymath;


public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;
        /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        AbstractFunction derivative = function.getDerivative();
        double x0 = lower;
        for(int i = 0; i < maxIterations; i++) {
            double y = function.evaluate(x0);
            double dy = derivative.evaluate(x0);

            if(Math.abs(dy) < tolerance) {
                break;
            }

            double x = x0 - y / dy;
            if(Math.abs(x - x0) < tolerance) {
                return x;
            }

            x0 = x;
        }
        return x0;
    }
}
