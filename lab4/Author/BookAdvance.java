package oop_hus.lab4.Author;

public class BookAdvance {
    String name;
    Author[] author;
    double price;
    int qty;

    public BookAdvance() {
    }

    public BookAdvance(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public BookAdvance(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // getAuthor
    public String getAuthorName() {
        String authorName = "{Author[name = ";
        for (int i = 0; i < author.length - 1; i++) {
            authorName += author[i].getName() + ",";
        }
        authorName += author[author.length - 1].getName() + "]}";
        return authorName;
    }

    // toString()
    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", author = " + getAuthorName() + ", price=" + price + ", qty=" + qty + ']';
    }
}
