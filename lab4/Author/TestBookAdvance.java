package oop_hus.lab4.Author;

public class TestBookAdvance {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhereovertherainbow.com", 'm');
        authors[1] = new Author("Paul Tan", "Pau@nowherethaticanhaveyou.com", 'f');
        //Declare and allocate a new instance of BookAdvance
        BookAdvance javaDummy = new BookAdvance("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}
