package oop_hus.lab4.AuthorYourTurn;


public class TestMain {
    public static void main(String[] args) {
        //Test Author class
        Author author1 = new Author("Tan Ah Teck", "youmakefeelbetter@Iwish.com");
        System.out.println(author1);
        author1.setEmail("Idontknow@whoareyou.com");
        System.out.println(author1);
        System.out.println("name is: " + author1.getName());
        System.out.println("email is: " + author1.getEmail());

        // Test Book class
        Book book1 = new Book("13412", "Java for God", author1, 69.90, 169);
        System.out.println(book1);

        book1.setPrice(8493.213);
        book1.setQty(123);
        System.out.println(book1);
        System.out.println("isbn is: " + book1.getIsbn());
        System.out.println("name is: " + book1.getName());
        System.out.println("price is: " + book1.getPrice());
        System.out.println("qty is: " + book1.getQty());
        System.out.println("author is: " + book1.getAuthor());
        System.out.println("author's name is: " + book1.getAuthorName());
        System.out.println("author's name: " + book1.getAuthor().getName());
        System.out.println("author's email: " + book1.getAuthor().getEmail());
    }
}
