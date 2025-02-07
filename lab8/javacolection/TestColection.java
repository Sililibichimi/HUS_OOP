package oop_hus.lab8.javacolection;

import java.util.*;

public class TestColection {
    public static void main(String[] args) {

        // Test Lists
        List<Integer> list = new ArrayList<>();
        // Add elements to list
        Lists.insertFirst(list, 3);
        Lists.insertLast(list, 312);
        Lists.insertLast(list, 69);
        Lists.insertLast(list, 96);
        // Replace 3rd element with 5
        Lists.replace(list, 5);
        Lists.removeThird(list);
        // Test removeEvil
        Lists.removeEvil(list);
        Lists.insertLast(list, 666);
        System.out.println(list);
        Lists.removeEvil(list);
        System.out.println(list);
        // generateSquares
        List<Integer> squares = Lists.generateSquares();
        System.out.println(squares);
        // Test contains
        System.out.println(Lists.contains(list, 2));
        System.out.println(Lists.contains(list, 69));
        // Copy a List
        List<Integer> copy = new ArrayList<>(list);
        Lists.copy(list, copy);
        System.out.println("List source: " + list);
        System.out.println("List copy: " + copy);
        // Reverse a List
        System.out.println("List source: " + list);
        Lists.reverseManual(list);
        System.out.println("List after reverse: " + list);

        // Test Sets
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // Add elements to sets
        set1.add(32);
        set1.add(69);
        set1.add(96);
        set2.add(69);
        set2.add(96);
        set2.add(6326);
        System.out.println("The intersection of the two sets is: " + Sets.intersectionManual(set1, set2));
        System.out.println("The union of the two sets is: " + Sets.unionManual(set1, set2));
        System.out.println("The intersection of the two sets is: " + Sets.intersection(set1, set2));
        System.out.println("The union of the two sets is: " + Sets.union(set1, set2));
        List<Integer> list1 = Sets.toList(set1);
        System.out.println("The list from the set is: " + list1);
        list1.add(69);
        System.out.println("Remove duplicate: " + Sets.removeDuplicates(list1));
        list1.add(69);
        list.add(96);
        System.out.println("Remove duplicates: " + Sets.removeDuplicatesMunual(list1));
        System.out.println("First recurring element: " + Sets.firstRecurringCharacter("Siuuuuuuuu"));
        System.out.println("All recurring elements: " + Sets.allRecurringChars("Siuuuuuuuusiiiiiusssssssssuuuuuuuuummmmmmalllllllllllll"));
        Integer[] array = Sets.toArray(set1);
        System.out.println("Array from set: ");
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        TreeSet<Integer> treeSet = new TreeSet<>(set1);
        System.out.println("TreeSet from set: " + treeSet);
        System.out.println("The first element of the set is: " + Sets.getFirst(treeSet));
        System.out.println("The last element of the set is: " + Sets.getLast(treeSet));
        System.out.println("Get greater than 43 : " + Sets.getGreater(treeSet, 43));

        // Test Maps
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(3, 1);
        map1.put(1, 2);
        map1.put(69, 96);
        map1.put(96, 69);

        System.out.println("The number of key-value mappings in the map is: " + Maps.count(map1));
        System.out.println("The map contains the key 69: " + Maps.contains(map1, 69));
        System.out.println("The map contains the key 69 with value 96: " + Maps.containsKeyValue(map1, 69, 96));
        System.out.println("The key set of the map is: " + Maps.keySet(map1));
        System.out.println("The value set of the map is: " + Maps.values(map1));
        System.out.println("The color of the value 1 is: " + Maps.getColor(1));
        System.out.println("The color of the value 2 is: " + Maps.getColor(2));
        System.out.println("The color of the value 3 is: " + Maps.getColor(3));

    }
}
