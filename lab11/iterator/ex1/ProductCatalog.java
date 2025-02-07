package oop_hus.lab11.iterator.ex1;

public class ProductCatalog implements Iterable {
    public Iterator iterator;
    public String[] productCatalog;

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator getIterator() {
        return iterator;
    }
}
