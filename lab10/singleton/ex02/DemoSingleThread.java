package oop_hus.lab10.singleton.ex02;

import java.util.Objects;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println();

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        System.out.println(Objects.equals(singleton.value, anotherSingleton.value) ? "yay!" : "boooo!");
    }
}
