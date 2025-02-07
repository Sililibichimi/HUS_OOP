package oop_hus.lab11.iterator.ex1;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] product = {"Beef", "Chicken", "Carrot", "Playstation", "Tivi"};

        Iterator productIterator = new ProductIterator(product);

        while (productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }
    }
}
