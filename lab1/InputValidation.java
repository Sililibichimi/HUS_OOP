import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input(sc);

    }

    static boolean isTrueInput(int number) {

        if (number >= 0 && number <= 10) return true;
        return number >= 90 && number <= 100;
    }

    static void input(Scanner sc) {

        int number = sc.nextInt();
        while (!isTrueInput(number)) {
            System.out.println("Invalid input, try again ...");
            number = sc.nextInt();
        }
        System.out.println("You have entered " + number);

    }

}
