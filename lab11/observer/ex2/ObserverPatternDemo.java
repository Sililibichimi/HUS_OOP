package oop_hus.lab11.observer.ex2;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer o1 = new BinaryObserver(subject);
        Observer o2 = new HexaObserver(subject);
        Observer o3 = new OctalObserver(subject);

        subject.notifyAllObservers();
        // Updated status.
        // Updated status.
        // Updated status.
    }
}