package oop_hus.lab6.ex2;

public class Person {
    // Name and address of the person
    private final String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "Person[name=" + name
                + ",address=" + address + "]";
    }
}
