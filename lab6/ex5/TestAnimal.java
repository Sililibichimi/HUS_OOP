package oop_hus.lab6.ex5;

public class TestAnimal {
    public static void main(String[] args) {
        // Test Dog
        // Create a dog with name "AnhQuan"
        Dog dog = new Dog("AnhQuan");
        // Print the dog
        System.out.println(dog);
        // Make the dog greet
        dog.greets();
        // Create another dog with name "CuocDoi"
        Dog anotherDog = new Dog("CuocDoi");
        // Make the dog greet another dog
        dog.greets(anotherDog);

        // Test Cat
        // Create a cat with name "MeoMeo"
        Cat cat = new Cat("MeoMeo");
        // Print the cat
        System.out.println(cat);
        // Make the cat meow
        cat.meow();
    }
}
