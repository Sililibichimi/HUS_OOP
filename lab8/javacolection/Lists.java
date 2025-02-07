package oop_hus.lab8.javacolection;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    /*
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    /*
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /*
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    /*
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(List<Integer> list) {
        if (list.size() > 2)
            list.remove(2);
    }

    /*
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(List<Integer> list) {
        while (list.contains(666)) {
            list.remove((Integer) 666);
        }
    }

    /*
     * Function returning a List<Integer> containing
     * the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquares() {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 10; ++i) {
            squares.add(i * i);
        }
        return squares;
    }

    /*
     * Function to verify if a list contain a certain value
     */
    public static boolean contains(List<Integer> list, int value) {
        return list.contains(value);
    }

    /*
     * Function to copy a líst into another list (without using the library function)
     * Note well: the target list must be empty before copy
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (Integer value : source) {
            target.add(value);
        }
    }

    /*
     * Function to reverse the elements of a list (without using the library function)
     */
    public static void reverseManual(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; ++i) {
            int temp = list.get(i); // storage the value of the i-th element
            list.set(i, list.get(size - 1 - i)); // set value i-th element to the value of the (size - 1 - i)-th element
            list.set(size - 1 - i, temp); // set value (size - 1 - i)-th element to the value of the i-th element
        }
    }

    /*
     * Function to insert the same element both at the
     * beginning and at the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     */
    public static void insertBeginningEnd(List<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
