package oop_hus.finalexam.matrix;

import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /*
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        Random rd = new Random();
        int size = rd.nextInt(5) + 5;
        SquareMatrix matrixNaruto = new SquareMatrix(size);
        SquareMatrix matrixSasuke = new SquareMatrix(size);

        System.out.println("Ma tran 1");
        System.out.println(matrixNaruto);
        System.out.println("Chuyen vi ma tran 1");
        System.out.println(matrixNaruto.transpose());
        System.out.println();

        System.out.println("Ma tran 2");
        System.out.println(matrixSasuke);
        System.out.println("Chuyen vi ma tran 2");
        System.out.println(matrixSasuke.transpose());
        System.out.println();

        System.out.println(" - Duong cheo chinh va duong cheo phu");
        System.out.println("+) ma tran 1");
        System.out.println("Duong cheo chinh :" + arrayToString(matrixNaruto.principalDiagonal()));
        System.out.println("Duong cheo phu   :" + arrayToString(matrixNaruto.secondaryDiagonal()));
        System.out.println();
        System.out.println("+) ma tran 2");
        System.out.println("Duong cheo chinh :" + arrayToString(matrixSasuke.principalDiagonal()));
        System.out.println("Duong cheo phu   :" + arrayToString(matrixSasuke.secondaryDiagonal()));
        System.out.println();

        System.out.println("Cong 2 ma tran");
        System.out.println(matrixNaruto.add(matrixSasuke));
        System.out.println();

        System.out.println("Tru ma tran 1 cho ma tran 2");
        System.out.println(matrixNaruto.minus(matrixSasuke));
        System.out.println();

        System.out.println("Nhan 2 ma tran");
        System.out.println(matrixNaruto.multiply(matrixSasuke));
        System.out.println();


    }

    public static String arrayToString(int[] a) {
        StringBuilder s = new StringBuilder("[");
        for (int e : a) {
            s.append(e).append(" ");
        }
        if (s.length() > 1) {
            s.delete(s.length()-1, s.length());
        }
        s.append("]");
        return s.toString();
    }
}