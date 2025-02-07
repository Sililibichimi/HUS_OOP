package oop_hus.lab6.ex5;

public class Dog extends Mammal {
    private String name;

    // Constructor
    public Dog(String name) {
        super(name);
        this.name = name;
    }

    // Sound of the dog
    public void greets() {
        System.out.println("Woof");
    }

    // Sound of the dog with another dog
    public void greets(Dog another) {
        System.out.println("Wooooof");
    }

    // toString
    @Override
    public String toString() {
        return "Dog[" + super.toString() +
                ']';
    }
}
