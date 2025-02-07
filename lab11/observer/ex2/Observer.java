package oop_hus.lab11.observer.ex2;

public abstract class Observer {
    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public abstract void update();
}
