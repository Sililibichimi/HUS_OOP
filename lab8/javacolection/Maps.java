package oop_hus.lab8.javacolection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Maps {

    /*
     * Function to return the number of key-value mappings in this map.
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    /*
     * Function to remove all mappings from this map.
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    /*
     * Function to test if a map contains a mapping for the specified key.
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    /*
     * Function to test if a map contains a mapping for
     * the specified key and if its value is equal to the specified value.
     */
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    /*
     * Function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    /*
     * Function to return the value set of map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    /*
     * Function, internally, using a map, returning "black",
     * "white", or "red" depending on int input value
     * "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        if (value < 0 || value > 2) {
            return "Invalid value";
        }
        Map<Integer, String> map = Map.of(0, "black", 1, "white", 2, "red");
        return map.get(value);
    }
}
