package oop_hus.lab11.observer.ex2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}
