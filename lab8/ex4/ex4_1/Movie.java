package oop_hus.lab8.ex4.ex4_1;


/*
 * A class 'Movie' that implements Comparable.
 */
public class Movie implements Comparable<Movie> {

    // Variables
    String name;
    double rating;
    int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    // override compareTo method
    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    // comparator method
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
