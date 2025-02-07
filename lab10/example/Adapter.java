package oop_hus.lab10.example;

public class Adapter extends Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        adaptee.specificExecute();
    }
}
