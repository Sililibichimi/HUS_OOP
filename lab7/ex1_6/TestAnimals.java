package oop_hus.lab7.ex1_6;

public class TestAnimals {
    public static void main(String[] args) {
        // Using the subclasses
        // Create a cat
        Cat cat = new Cat("Jerry");
        System.out.println("Cat: " + cat.name); // print the name of the cat
        cat.greets(); // the greeting of the cat

        // Create a dog
        Dog dog = new Dog("Sasuke");
        Dog dog2 = new Dog("Naruto");
        System.out.println("Dog: " + dog.name); // print the name of the dog
        dog.greets(); // the greeting of the dog
        dog.greets(dog2); // when sakuke dog meets naruto dog

        // Create a big dog
        Animal bigDog = new BigDog("Kakashi");
        BigDog bigDog2 = new BigDog("Nagato");
        System.out.println("BigDog: " + bigDog.name); // print the name of the big dog
        bigDog.greets(); // the greeting of the big dog


        // Using PolyMorphism
        Animal cat1 = new Cat("Itachi");
        cat1.greets(); // the greeting of the cat
        // Downcast
        BigDog bigDog1 = (BigDog) bigDog2;
        bigDog1.greets(dog); // when nagato big dog meets sasuke dog
        bigDog1.greets(bigDog2); // when kakashi big dog greets itself
    }
}
