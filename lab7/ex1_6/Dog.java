package oop_hus.lab7.ex1_6;

public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Overriding the greets method
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Greets with another dog
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
