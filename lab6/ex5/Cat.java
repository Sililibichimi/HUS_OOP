package oop_hus.lab6.ex5;

public class Cat extends Mammal {
    private String name;

    // Constructor
    public Cat(String name) {
        super(name);
        this.name = name;
    }

    // Sound of the cat
    public void meow() {
        System.out.println("Meow");
    }

    // toString
    @Override
    public String toString() {
        return "Cat[" + super.toString() +
                ']';
    }
}
