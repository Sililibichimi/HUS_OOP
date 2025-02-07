package oop_hus.lab10.singleton.example;

public class UseMoney {
    public static void main(String[] args) {
        Money myMoney = new Money();
        System.out.println("The money you have");
        System.out.println(myMoney.getInstacne());
        System.out.println("The money you have");
        System.out.println(myMoney.getInstacne());
    }
}
