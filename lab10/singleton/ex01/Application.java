package oop_hus.lab10.singleton.ex01;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();

        foo.query("A foo");

        Database bar = Database.getInstance();
        bar.query("A bar");

        System.out.println(foo == bar);
    }
}
