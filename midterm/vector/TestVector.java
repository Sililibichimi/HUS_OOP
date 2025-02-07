package oop_hus.midterm.vector;

import java.util.Random;

public class TestVector {
    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
           - Tạo ra các vector có kích thước n, với các phần tử được sinh ngẫu nhiên. Trong đó có 2 vector kiểu MyArrayList
             và 2 vector có kiểu MyListVector.
           - Viết các hàm để test các chứ năng của các vector, như thêm vào phần tử, xóa bớt phần tử, sửa giá trị các
             phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector, chuẩn vector, ... Mỗi lần thay
             đổi vector hoặc tính toán, in kết quả ra terminal.

         II. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt). Nén các file source code và file kết quả vào file zip có tên
              <Ten_MaSinhVien_Vector>.zip (ví dụ NguyenVanA_123456_Vector.zip), nộp lên classroom.
         */
        System.out.println("Test My Vector - Nguyen Duc Si - 22000123 ");
        System.out.println("_______________________________________________________________");
        Random rd = new Random();
        int n = rd.nextInt(20);
        MyVector vectorNaruto = new MyArrayVector();
        MyVector vectorSasuke = new MyListVector();
        for(int i = 0; i < n; ++i) {
            double a = Math.round(rd.nextDouble(100) * 100.0) / 100.0;
            vectorNaruto.insert(a);

            double b = Math.round(rd.nextDouble(100) * 100.0) / 100.0;
            vectorSasuke.insert(b);
        }

        System.out.println("The first vector : " + vectorNaruto);
        System.out.println("The second vetor : " + vectorSasuke);

        double value = Math.round(rd.nextDouble(10) * 100.0) / 100.0;
        System.out.println("\nAdd two vector: " + vectorSasuke.add(vectorNaruto));
        System.out.println("\nMinus two vevtor" + vectorNaruto.minus(vectorSasuke));

        System.out.println("\nMinus first vector by a value: " + value + " = " + vectorNaruto.minus(value));

        value = Math.round(rd.nextDouble(10) * 100.0) / 100.0;
        System.out.println("\nAdd second vector by a value: "+ value + vectorSasuke.add(value));

        value = Math.round(rd.nextDouble(10) * 100.0) / 100.0;
        System.out.println("\nAdd first vector with a value: "+ value + " = " + vectorNaruto.add(value));
        System.out.println("\nScale first vector with a value: "+ value + " = " + vectorNaruto.scale(value));

        System.out.println("\nNorm of first vector: " + vectorNaruto.norm());
        System.out.println("\nRemove a number of first vector: " + vectorNaruto.remove(rd.nextInt(n - 1)));
        System.out.println("\nextract from Vector1: " + vectorNaruto.extract(new int[]{1, 3, 5}));
    }
}