package oop_hus.lab11.iterator.ex1;

public class ProductIterator implements Iterator {
    private final String[] products;

    private int index;

    public ProductIterator(String[] products) {
        this.products = products;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < products.length;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            ++index;
            return products[index];
        }
        return null;
    }
}
