package oop_hus.lab11.observer.ex2;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}