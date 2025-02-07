package oop_hus.finalexam.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        return integrate(poly, lower, upper, 10000);
    }

    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double ans = 0;
        double delta  = (upper - lower) / numOfSubIntervals;
        double[] x = new double[numOfSubIntervals+1];
        for (int i = 0; i <= numOfSubIntervals; i++) {
            x[i] = lower + i * delta;
        }

        for (int i = 0; i <= numOfSubIntervals; i++) {
            if (i == 0 || i == numOfSubIntervals) {
                ans += poly.evaluate(x[i]);
                continue;
            }
            if (i % 2 == 0) {
                ans += 2 * poly.evaluate(x[i]);
            } else {
                ans += 4 * poly.evaluate(x[i]);
            }
        }
        ans *= delta / 3;
        return ans;
    }
}