package oop_hus.lab11.iterator.ex3;

public interface MyList extends MyIterable {
    int size();

    Object get(int index);

    void set(Object payload, int index);

    void append(Object payload);

    void insert(Object payload, int index);

    void remove(int index);
}
