package oop_hus.finalexam.search;

public class TestBinarySearch {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Tạo đối tượng có kiểu dữ liệu BinarySearch. Dùng đối tượng này test thuật toán tìm kiếm nhị phân với
          mảng dữ liệu đã sinh ra, và sử dụng 3 thuật toán sắp xếp khác nhau như đã cho.

          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 3.0: 2

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]
          Binary search giá trị 6.0:-1

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_BinarySearch.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BinarySearch>.zip (Ví dụ, NguyenVanA_123456_BinarySearch.zip),
          nộp lên classroom
         */

        int n = (int) (Math.random() * 11) + 20;
        double[] dataNaruto = new double[n];
        for (int i = 0; i < n; i++) {
            dataNaruto[i] = Math.round(Math.random() * 100.0);
        }

        // Bubble Sort
        System.out.println("\nUsing Bubble Sort Algorithm:");
        System.out.print("Before sorting: ");
        BinarySearch.print(dataNaruto);

        Sorter bubbleSort = new BubbleSort();
        BinarySearch.getInstance().setSorter(bubbleSort);

        double value = Math.round(Math.random() * 100.0);
        int pos = BinarySearch.getInstance().search(dataNaruto, value);

        System.out.print("After sorting: ");
        BinarySearch.print(dataNaruto);

        System.out.printf("Binary search giá trị %.2f: %d\n", value, pos);

        // Insertion Sort
        double[] dataSasuke = new double[n];
        for (int i = 0; i < n; i++) {
            dataSasuke[i] = Math.round(Math.random() * 100.0)  ;
        }
        System.out.println("\nUsing Insertion Sort Algorithm:");
        System.out.print("Before sorting: ");
        BinarySearch.print(dataSasuke);

        Sorter insertionSort = new InsertionSort();
        BinarySearch.getInstance().setSorter(insertionSort);

        value = Math.round(Math.random() * 100.0)  ;
        pos = BinarySearch.getInstance().search(dataSasuke, value);

        System.out.print("After sorting: ");
        BinarySearch.print(dataSasuke);

        System.out.printf("Binary search giá trị %.2f: %d\n", value, pos);

        // Selection Sort
        double[] dataKakashi = new double[n];
        for (int i = 0; i < n; i++) {
            dataKakashi[i] = Math.round(Math.random() * 100.0)  ;
        }
        System.out.println("\nUsing Selection Sort Algorithm:");
        System.out.print("Before sorting: ");
        BinarySearch.print(dataKakashi);

        Sorter selectionSort = new SelectionSort();
        BinarySearch.getInstance().setSorter(selectionSort);

        value = Math.round(Math.random() * 100.0)  ;
        pos = BinarySearch.getInstance().search(dataKakashi, value);

        System.out.print("After sorting: ");
        BinarySearch.print(dataKakashi);

        System.out.printf("Binary search giá trị %.2f: %d\n", value, pos);
    }
}
