package oop_hus.lab12.ex01;

public class TestMyList {
    public static void main(String[] args) {
//        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        System.out.println("Using ArrayList:");
        MyList arrayList = new MyArrayList();
        arrayList.append(1.0);
        arrayList.append(2.0);
        arrayList.append(3.0);
        arrayList.append(4.0);
        arrayList.append(5.0);
        BasicStatistic basicStatistic = new BasicStatistic(arrayList);

        System.out.println(arrayList);

        System.out.printf("Max is: %.2f\n", basicStatistic.max());
        System.out.printf("Min is: %.2f\n", basicStatistic.min());
        System.out.printf("Mean is: %.2f\n", basicStatistic.mean());
        System.out.printf("Variance is: %.2f\n", basicStatistic.variance());
    }

    public static void testMyLinkedList() {
        System.out.println("Using LinkedList:");
        MyList linkedList = new MyLinkedList();
        linkedList.append(5.0);
        linkedList.append(6.0);
        linkedList.append(7.0);
        linkedList.append(8.0);
        linkedList.append(9.0);
        BasicStatistic basicStatistic = new BasicStatistic(linkedList);

        System.out.println(linkedList);

        System.out.printf("Max is: %.2f\n", basicStatistic.max());
        System.out.printf("Min is: %.2f\n", basicStatistic.min());
        System.out.printf("Mean is: %.2f\n", basicStatistic.mean());
        System.out.printf("Variance is: %.2f\n", basicStatistic.variance());
    }
}
