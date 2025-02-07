package oop_hus.lab8.ex4.ex4_1;

import java.util.ArrayList;
import java.util.List;

public class TestMovies {

    public static void sortMoviesByYearUsingBubbleSort(List<Movie> list) {
        for (int i = 0; i < list.size() - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; ++j) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    Movie temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
                swapped = true;
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void sortMoviesByNameUsingBubbleSort(List<Movie> list, MovieNameComparator comparator) {
        for (int i = 0; i < list.size() - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < list.size() - i - 1; ++j) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    Movie temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
                swapped = true;
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Casino Royale", 8.1, 2006);
        Movie m2 = new Movie("The Dark Knight", 9.0, 2008);
        Movie m3 = new Movie("Inception", 8.8, 2010);
        Movie m4 = new Movie("The Shawshank Redemption", 9.3, 1994);
        Movie m5 = new Movie("The Godfather", 9.2, 1972);
        List<Movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        if (m1.compareTo(m2) > 0) System.out.println("m1 > m2");
        System.out.println("Before sorting:" + list);
        sortMoviesByYearUsingBubbleSort(list);
        // sortMoviesByNameUsingBubbleSort(list, new MovieNameComparator());
        System.out.println("After sorting:" + list);

    }

}
