package oop_hus.lab6.ex5;

public class Mammal extends Animal {
    private String name;

    // Constructor
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Mammal[" + super.toString() +
                ']';
    }
}
