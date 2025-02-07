package oop_hus.lab4.CustomerAndAccount;

public class Customer {
    //Attributes
    private int ID;
    private String name;
    private char gender;

    //Constructor
    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    //Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + ID + ")";
    }
}
