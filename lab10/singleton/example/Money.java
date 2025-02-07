package oop_hus.lab10.singleton.example;

import java.util.Scanner;

public class Money {
    private static Integer moneyInstance;

    public Money() {
    }

    ;

    public Money(int money) {
        if (moneyInstance == null) {
            moneyInstance = money;
        } else {
            System.out.println("You have too much money");
        }
    }

    public int getInstacne() {
        if (moneyInstance == null) {
            System.out.println("You don't have money, please add more money");
            System.out.print("Enter number of money: ");
            Scanner sc = new Scanner(System.in);
            moneyInstance = sc.nextInt();
        }
        return moneyInstance;
    }
}
