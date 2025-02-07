package oop_hus.finalexam.mymath;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();

    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        String function = "sin(x)*x - 3";
        AbstractFunction f = new UnivariateRealFunction(function);
        f.setDerivative(new UnivariateRealFunction("x*cos(x) + sin(x)"));
        System.out.println("My function: " + function);

        double upper = 14;
        double lower = 12;
        int maxIterations = 100;
        double tolerance = 1e-6;

        System.out.println("Caclulating root of the " + function + " in the range [" + lower + ", " + upper + "]");

        RootSolver bisectionSolver = new BisectionSolver(tolerance, maxIterations);
        RootSolver newtonRaphsonSolver = new NewtonRaphsonSolver(tolerance, maxIterations);
        RootSolver secantSolver = new SecantSolver(tolerance, maxIterations);

        UnivariateRealRootFinding procession = new UnivariateRealRootFinding(f, bisectionSolver);
        System.out.println("Using bisection method: " + procession.solve(lower, upper));

        procession.setRootSolver(newtonRaphsonSolver);
        System.out.println("Using Newton-Raphson method: " + procession.solve(lower, upper));

        procession.setRootSolver(secantSolver);
        System.out.println("Using Secant method: " + procession.solve(lower, upper));

    }
}
