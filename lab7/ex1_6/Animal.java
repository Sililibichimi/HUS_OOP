package oop_hus.lab7.ex1_6;

public abstract class Animal {
    protected String name; // name of the animal

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
