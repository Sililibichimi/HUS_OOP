package oop_hus.lab10.singleton.ex03;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println(boiler);

        boiler.fill();
        System.out.println(boiler);

        boiler.boil();
        System.out.println(boiler);

        boiler.drain();
        System.out.println(boiler);

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

        System.out.println(boiler == boiler2);
        boiler.drain();
        System.out.println(boiler == boiler2);
    }
}
