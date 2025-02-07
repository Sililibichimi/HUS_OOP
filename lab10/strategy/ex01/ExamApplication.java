package oop_hus.lab10.strategy.ex01;

import java.util.Objects;
import java.util.Scanner;

public class ExamApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        System.out.print("Read first number : ");
        int number1 = sc.nextInt();
        System.out.println();
        System.out.print("Read last number : ");
        int number2 = sc.nextInt();
        System.out.println();

        String[] actions = {"addition", "subtraction", "multiplication"};
        System.out.print("Read action : ");
        String action = sc.next();

        if (Objects.equals(action, actions[0])) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (Objects.equals(action, actions[1])) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        System.out.println(context.executeStrategy(number1, number2));
    }
}
