package oop_hus.lab8.ex4.ex4_1;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie x, Movie y) {
        return x.getName().compareTo(y.getName());
    }

}
