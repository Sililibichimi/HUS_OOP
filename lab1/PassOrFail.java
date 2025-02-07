import java.util.Scanner;

public class PassOrFail {
    static boolean isPass(int mark) {
        if (mark >= 50) return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (isPass(mark)) System.out.println("PASS");
        else System.out.println("FAIL");

        System.out.println("DONE");
    }

}
