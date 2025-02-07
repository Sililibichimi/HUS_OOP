package oop_hus.finalexam.book;

public class BookManager {
    private static BookManager instance;
    private MyList bookList;

    private BookManager() {
        this.bookList = new MyLinkedList();
    }

    public static BookManager getInstance() {
        if (instance == null) {
            instance = new BookManager();
        }
        return instance;
    }

    public MyList getBookList() {
        return this.bookList;


    }

    /**
     * Thêm book vào đầu danh sách.
     * @param book
     */
    public void insertAtStart(Book book) {
        Book cur = book;
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        this.bookList.insertAtEnd(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPosition(Book book, int index) {
        this.bookList.insertAtPosition(book, index);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        this.bookList.remove(index);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        return (Book) this.bookList.get(index);
    }

    /**
     * Lấy ra sách có giá cao nhất.
     * @return
     */
    public Book highestPriceBook() {
        Book max = (Book) this.bookList.get(0);
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getPrice() > max.getPrice()) {
                max = cur;
            }
        }
        return max;
    }

    /**
     * Lấy ra sách có giá thấp nhất.
     * @return
     */
    public Book lowestPriceBook() {
        Book min = (Book) this.bookList.get(0);
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getPrice() < min.getPrice()) {
                min = cur;
            }
        }
        return min;
    }

    /**
     * Lấy ra sách có số trang cao nhất.
     * @return
     */
    public Book highestNumberOfPagesBook() {
        Book max = (Book) this.bookList.get(0);
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getPages() > max.getPages()) {
                max = cur;
            }
        }
        return max;
    }

    /**
     * Lấy ra sách có số trang thấp nhất.
     * @return
     */
    public Book lowestNumberOfPagesBook() {
        Book min = (Book) this.bookList.get(0);
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getPages() < min.getPages()) {
                min = cur;
            }
        }
        return min;
    }

    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public MyList filterBooksOfPublisher(String publisher) {
        MyList result = new MyLinkedList();
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getPublisher().equals(publisher)) {
                result.insertAtEnd(cur);
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public MyList filterBooksOfGenre(String genre) {
        MyList result = new MyLinkedList();
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getGenre().equals(genre)) {
                result.insertAtEnd(cur);
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public MyList filterBooksOfAuthor(String author) {
        MyList result = new MyLinkedList();
        MyIterator iterator = this.bookList.iterator();
        while (iterator.hasNext()) {
            Book cur = (Book) iterator.next();
            if (cur.getAuthor().equals(author)) {
                result.insertAtEnd(cur);
            }
        }
        return result;
    }

    public static void print(MyList list) {
        MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
