package oop_hus.hu.bookmanager;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        /* TODO */
        return bookList;
    }

    /**
     * Kiểm tra xem chỉ số index có nằm trong đoạn [0 - limit] hay không.
     * @param index
     * @param limit
     * @return
     */
    private boolean checkBoundaries(int index, int limit) {
        return (index >= 0 && index <= limit);
    }

    /**
     * Thêm book vào cuối danh sách.
     * @param book
     */
    public void insertAtEnd(Book book) {
        /* TODO */
        bookList.add(book);
    }

    /**
     * Thêm book vào danh sách ở vị trí index.
     * @param book
     * @param index
     */
    public void insertAPos(Book book, int index) {
        /* TODO */
        if(!checkBoundaries(index, bookList.size())) return;
        bookList.add(index, book);
    }

    /**
     * Xóa book ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        if(!checkBoundaries(index, bookList.size() - 1)) return;
        bookList.remove(index);
    }

    /**
     * Bỏ book như tham số truyền vào.
     * @param book
     */
    public void remove(Book book) {
        /* TODO */
        bookList.remove(book);
    }

    /**
     * Lấy ra book ở vị trí index
     * @param index
     * @return
     */
    public Book bookAt(int index) {
        /* TODO */
        if(!checkBoundaries(index, bookList.size() - 1)) return null;
        return bookList.get(index);
    }

    /**
     * Sắp xếp danh sách book theo thứ tự tăng dần theo title.
     * @return
     */
    public List<Book> sortIncreasingByTitle() {
        /* TODO */
        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(sortedListBook.get(i).compareTo(sortedListBook.get(j)) > 0) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title tăng dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortIncreasingTitleAndPrice() {
        /* TODO */
        MyBookComparator myBookComparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                int temp = left.getTitle().compareTo(right.getTitle());
                if(temp == 0) temp = Double.compare(right.getPrice(), left.getPrice());
                return temp;
            }
        };

        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(myBookComparator.compare(sortedListBook.get(i), sortedListBook.get(j)) > 0) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp sách theo tiêu chí, đầu tiên theo title giảm dần, nếu title như nhau thì theo thứ tự giá giảm dần.
     * Sử dụng giao diện MyBookComparator để thực hiện tiêu chí sắp xếp.
     * @return
     */
    public List<Book> sortDecreasingTitleAndPrice() {
        /* TODO */
        MyBookComparator myBookComparator = new MyBookComparator() {
            @Override
            public int compare(Book left, Book right) {
                int temp = right.getTitle().compareTo(left.getTitle());
                if(temp == 0) temp = Double.compare(right.getPrice(), left.getPrice());
                return temp;
            }
        };

        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(myBookComparator.compare(sortedListBook.get(i), sortedListBook.get(j)) > 0) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp book theo giá tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPrice() {
        /* TODO */
        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(Double.compare(sortedListBook.get(i).getPrice(), sortedListBook.get(j).getPrice()) > 0) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp book theo giá giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPrice() {
        /* TODO */
        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(Double.compare(sortedListBook.get(i).getPrice(), sortedListBook.get(j).getPrice()) < 0) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp book theo số trang tăng dần.
     * @return
     */
    public List<Book> sortIncreasingPages() {
        /* TODO */
        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(sortedListBook.get(i).getPages() > sortedListBook.get(j).getPages()) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Sắp xếp book theo số trang giảm dần.
     * @return
     */
    public List<Book> sortDecreasingPages() {
        /* TODO */
        List<Book> sortedListBook = new ArrayList<>(bookList);
        for(int i = 0; i < sortedListBook.size() - 1; ++i) {
            for(int j = i + 1; j < sortedListBook.size(); ++j) {
                if(sortedListBook.get(i).getPages() < sortedListBook.get(j).getPages()) {
                    Book temp = sortedListBook.get(i);
                    sortedListBook.set(i, sortedListBook.get(j));
                    sortedListBook.set(j, temp);
                }
            }
        }
        return sortedListBook;
    }

    /**
     * Lọc ra howMany book có giá lớn nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterHighestPrice(int howMany) {
        /* TODO */
        int size = Math.min(howMany, bookList.size());
        List<Book> sortedList = sortDecreasingPrice();
        return sortedList.subList(0, size);
    }

    /**
     * Lọc ra những book có giá cao hơn lowerBound.
     * @param lowerBound
     * @return
     */
    public List<Book> filterBooksPriceHigherThan(double lowerBound) {
        /* TODO */
        List<Book> sortedList = sortDecreasingPrice();
        List<Book> result = new ArrayList<>();
        while (Double.compare(sortedList.getFirst().getPrice(),lowerBound) > 0) {
            result.add(sortedList.getFirst());
            sortedList.removeFirst();
        }
        return result;
    }

    /**
     * Lọc ra howMany book có số trang nhỏ nhất.
     * @param howMany
     * @return
     */
    public List<Book> filterBookLowestPages(int howMany) {
        /* TODO */
        int size = Math.min(howMany, bookList.size());
        List<Book> sortedList = sortIncreasingPages();
        return sortedList.subList(0, size);
    }

    /**
     * Lọc ra howMany book có số trang nhỏ hơn upperBound.
     * @param upperBound
     * @return
     */
    public List<Book> filterBooksPagesLowerThan(double upperBound) {
        /* TODO */
        List<Book> sortedList = sortIncreasingPrice();
        List<Book> result = new ArrayList<>();
        while (sortedList.getFirst().getPrice() < upperBound) {
            result.add(sortedList.getFirst());
            sortedList.removeFirst();
        }
        return result;
    }



    /**
     * Lọc ra những book theo nhà xuất bản.
     * @param publisher
     * @return
     */
    public List<Book> filterBooksOfPublisher(String publisher) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getPublisher().compareTo(publisher) == 0) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo thể loại.
     * @param genre
     * @return
     */
    public List<Book> filterBooksOfGenre(String genre) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getGenre().compareTo(genre) == 0) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Lọc ra những book theo tác giả.
     * @param author
     * @return
     */
    public List<Book> filterBooksOfAuthor(String author) {
        /* TODO */
        List<Book> result = new ArrayList<>();
        for(Book book : bookList) {
            if(book.getAuthor().compareTo(author) == 0) {
                result.add(book);
            }
        }
        return result;
    }

    public static String titleOfBooksToString(List<Book> bookList) {
        StringBuilder titleOfBooks = new StringBuilder();
        titleOfBooks.append("[\n");
        for (Book book : bookList) {
            titleOfBooks.append(book.getTitle()).append("\n");
        }
        return titleOfBooks.toString().trim() + "\n]";
    }

    public static void print(List<Book> bookList) {
        StringBuilder booksString = new StringBuilder();
        booksString.append("[\n");
        for (Book book : bookList) {
            booksString.append(book.toString()).append("\n");
        }
        System.out.print(booksString.toString().trim() + "\n]");
    }
}
