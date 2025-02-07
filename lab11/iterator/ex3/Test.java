package oop_hus.lab11.iterator.ex3;

public class Test {
    public static void main(String[] args) {
        MyList list1 = new MyArrayList();
        list1.append("Daxua");
        list1.append(69);
        list1.append(false);
        list1.append("Hello");

        MyIterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
