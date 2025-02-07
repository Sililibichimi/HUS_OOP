package oop_hus.lab7.ex1_6;

public class BigDog extends Dog {
    // Constructor
    public BigDog(String name) {
        super(name);
    }

    // Overriding the greets method
    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    // Greets with a dog
    public void greets(Dog another) {
        System.out.println("Woooooooow");
    }

    // Greets with another big dog
    public void greets(BigDog another) {
        System.out.println("Wooooooooooooow");
    }
}
