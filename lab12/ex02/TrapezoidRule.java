package oop_hus.lab12.ex02;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int numOfSubIntervals = 2;
        double result = 0;
        double previousResult = 0;
        double error = 0;
        int numOfIterations = 0;

        do {
            previousResult = result;
            result = integrate(poly, lower, upper, numOfSubIntervals);
            error = Math.abs(result - previousResult) / 3;
            numOfSubIntervals *= 2;
            numOfIterations++;
        } while (error >= precision && numOfIterations <= maxIterations);

        return result;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        double deltaX = (upper - lower) / numOfSubIntervals;
        double x, y;
        x = lower;
        double valueAtX = poly.evaluate(x);
        y = lower;
        double area = 0;
        for(int i = 1; i <= numOfSubIntervals; ++i) {
            if(i == numOfSubIntervals) {
                y = upper;
            } else {
                y += deltaX;
            }
            double valueAtY = poly.evaluate(y);
            area += valueAtY + valueAtX;
            x = y;
            valueAtX = valueAtY;
        }
        return area * deltaX / 2;
    }
}
