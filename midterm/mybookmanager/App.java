package oop_hus.midterm.mybookmanager;

import oop_hus.midterm.MyList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        System.out.println("Test of My Book Manager - Nguyen Duc Si - 22000123");
        System.out.println("_____________________________________________________________________");
        init();
        testOriginalData();
        testFilterBooksOfAuthor();
        testFilterBooksOfPublisher();
        testFilterBooksOfGenre();
        testGetHighestPriceBook();
        testGetLowestPriceBook();
        testGetHighestNumberOfPagesBook();
        testGetLowestNumberOfPagesBook();

        /* Yêu cầu:
        - Hoàn thiện code chương trình theo mẫu đã cho.
        - Viết code để test cho tất cả các hàm test bên dưới.

        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_MyBookManager>.txt (Ví dụ, NguyenVanA_123456_MyBookManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BookMyManager>.zip (Ví dụ, NguyenVanA_123456_BookMyManager.zip),
          nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "data/books.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("title")) {
                    continue;
                }

                Book newBook = new Book.BookBuilder(dataList.get(0))
                        .withAuthor(dataList.get(1))
                        .withGenre(dataList.get(2))
                        .withPages(Integer.parseInt(dataList.get(3)))
                        .withPrice(Double.parseDouble(dataList.get(4)))
                        .withPublisher(dataList.get(5))
                        .build();
                BookManager.getInstance().getBookList().insertAtEnd(newBook);
                /*
                TODO
                Đọc được dữ liệu, tạo ra các đối tượng Book ở đây, và cho vào BookManager để quản lý.

                Gợi ý:
                Các đội tượng Book không thể được tạo trực tiếp ở đây do hàm dựng là private,
                các đối tượng này được tạo ra bằng cách sử dụng Builder Pattern, ví dụ theo cách sau:
                Book newBook = new Book.BookBuilder(title).
                    .withAuthor(author)
                    .withGenre(genre)
                    ...
                    .build();
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        System.out.println("\nOriginal Data");
        System.out.println(BookManager.getInstance().getBookList().size());
        BookManager.printMyList(BookManager.getInstance().getBookList());
    }

    /**
     * Test lọc ra những book theo tác giả.
     */
    public static void testFilterBooksOfAuthor() {
        System.out.println("\nTest filter books of author:");

        String myAuthor = "Villani Cedric";
        MyList result = BookManager.getInstance().filterBooksOfAuthor(myAuthor);

        System.out.println("Books of author " + myAuthor + "are :");
        BookManager.printMyList(result);

    }

    /**
     * Test lọc ra những book theo nhà xuất bản.
     */
    public static void testFilterBooksOfPublisher() {
        System.out.println("\nFilter books of publisher:");
        String publisher = "Penguin";

        MyList result = BookManager.getInstance().filterBooksOfPublisher(publisher);
        System.out.println("Books of publisher " + publisher + "are :");

        BookManager.printMyList(result);
    }

    /**
     * Test lọc ra những book theo thể loại.
     */
    public static void testFilterBooksOfGenre() {
        System.out.println("\nFilter books of genre:");
        String genre = "science";

        MyList result = BookManager.getInstance().filterBooksOfGenre(genre);
        System.out.println("Books of genre " + genre + ":");

        BookManager.printMyList(result);
    }

    /**
     * Test lấy ra sách có giá cao nhất.
     */
    public static void testGetHighestPriceBook() {
        System.out.print("\nGet highest price book:");
        System.out.println(BookManager.getInstance().highestPriceBook());
    }

    /**
     * Test lấy ra sách có giá thấp nhất.
     */
    public static void testGetLowestPriceBook() {
        System.out.print("\nLowest price book is:");
        System.out.println(BookManager.getInstance().lowestPriceBook());
    }

    /**
     * Test lấy ra sách có số trang cao nhất.
     */
    public static void testGetHighestNumberOfPagesBook() {
        System.out.print("\nHighest number of pages book is:");
        System.out.println(BookManager.getInstance().highestNumberOfPagesBook());
    }

    /**
     * Test lấy ra sách có số trang thấp nhất.
     */
    public static void testGetLowestNumberOfPagesBook() {
        System.out.println("\nLowest number of pages book is:");
        System.out.println(BookManager.getInstance().lowestNumberOfPagesBook());
    }
}
