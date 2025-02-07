package oop_hus.lab11.observer.ex1;

public class ConcreteSubscriber2 implements Subscriber {
    @Override
    public void update(int state) {
        System.out.println("Concrete Subscriber 2 updated state " + state);
    }
}
