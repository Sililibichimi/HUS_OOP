package oop_hus.lab7.ex1_6;

public class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Overriding the greets method
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
