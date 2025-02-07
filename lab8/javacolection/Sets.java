package oop_hus.lab8.javacolection;

import java.util.*;

public class Sets {

    /*
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer element : first) {
            if (second.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    /*
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (int element : first) {
            result.add(element);
        }
        for (int value : second) {
            result.add(value);
        }
        return result;
    }

    /*
     * Function returning the difference of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    /*
     * Function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /*
     * Function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection !
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new LinkedList<>(source);
    }

    /*
     * Function to remove duplicates from a list
     * without using the constructor trick seen above
     */
    public static List<Integer> removeDuplicatesMunual(List<Integer> source) {
        Set<Integer> result = new HashSet<>(source);
        return new LinkedList<>(result);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<>();
        for (Integer value : source) {
            set.add(value);
        }
        List<Integer> result = new LinkedList<>();
        for (Integer value : set) {
            result.add(value);
        }
        return result;
    }

    /*
     * Function accepting a string s
     * returning the first recurring character
     * For example firstRecurring("abcaco") returns 'a'
     */
    public static String firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int idex = 0; idex < s.length(); ++idex) {
            char c = s.charAt(idex);
            if (set.contains(c)) {
                return String.valueOf(c);
            }
            set.add(c);
        }
        return "No recurring character found";
    }

    /*
     * Function accepting a string s
     * and returning a set comprising all recurring characters
     * For example allRecurring("mamma") returns {'m', 'a'}
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> result = new HashSet<>();
        for (int idex = 0; idex < s.length(); ++idex) {
            char c = s.charAt(idex);
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                result.add(c);
            }
        }
        return result;
    }

    /*
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        Integer[] result = new Integer[source.size()];
        for (int idex = 0; idex < result.length; ++idex) {
            result[idex] = source.toArray(new Integer[0])[idex];
        }
        return result;
    }

    /*
     * Function to return the first item from a TreeSet
     * Note well : use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /*
     * Function to return the last item from a TreeSet
     * Note well : use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /*
     * Function to get an element from a TreeSet
     * which is strictly greater than a given value
     * Note well : use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        Integer x = source.higher(value);
        if (x == null) {
            return Integer.MAX_VALUE;
        } else return x;
    }
}
