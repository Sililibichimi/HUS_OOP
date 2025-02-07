package oop_hus.lab6.ex5;

public class Animal {
    // name of the animal
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name + '\'' +
                ']';
    }
}
