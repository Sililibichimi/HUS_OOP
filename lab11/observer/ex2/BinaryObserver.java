package oop_hus.lab11.observer.ex2;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}