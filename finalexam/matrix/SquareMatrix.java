package oop_hus.finalexam.matrix;

import java.util.*;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    public SquareMatrix(int[][] data) {
        this.data = data;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    private void initRandom(int size) {
        Random random = new Random();
        data = new int[size][size];
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                data[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public int[][] getData() {
        return data;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        int size = data[0].length;
        int result[] = new int[size];
        for (int i = 0; i < size; ++i) {
            result[i] = data[i][i];
        }
        return result;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        int size = data[0].length;
        int result[] = new int[size];
        for (int i = 0; i < size; ++i) {
            result[i] = data[i][size - i - 1];
        }
        return result;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */

    private boolean isPrime(int number) {
        for(int i = 2; i * i <= number; ++i) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] primes() {
        int size = data.length;
        int resSize = 0;
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if (isPrime(data[i][j])) {
                    result.add(data[i][j]);
                    resSize++;
                }
            }
        }

        int[] res = new int[resSize];
        for(int i = 0; i < resSize; ++i) {
            res[i] = result.get(i);
        }
        return res;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */

    public SquareMatrix getSortedMatrix() {
        int size = data.length;
        List<Integer> dataToArray = new LinkedList<Integer>();
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                dataToArray.add(data[i][j]);
            }
        }
        Collections.sort(dataToArray);

        int res[][] = new int[size][size];
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                res[i][j] = (int)dataToArray.get(i * size + j);
            }
        }
        return new SquareMatrix(res);
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        int[][] thatData = that.getData();
        int size = thatData.length;

        if(data.length != size) {
            System.out.println("Can not add two Square Matrix");
            return null;
        }

        int[][] res = new int[size][size];
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                res[i][j] = data[i][j] + thatData[i][j];
            }
        }
        return new SquareMatrix(res);
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        int[][] thatData = that.getData();
        int size = thatData.length;

        if(data.length != size) {
            System.out.println("Can not minus two Square Matrix");
            return null;
        }

        int[][] res = new int[size][size];
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                res[i][j] = data[i][j] - thatData[i][j];
            }
        }
        return new SquareMatrix(res);
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        int[][] thatData = that.getData();
        if (thatData.length != data.length) {
            return null;
        }

        int[][] a = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < data.length; k++) {
                    a[i][j] += data[k][j] * data[i][k];
                }
            }
        }

        return new SquareMatrix(a);
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        int[][] a = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                a[i][j] = value * data[i][j];
            }
        }

        return new SquareMatrix(a);
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        int[][] a = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                a[i][j] = data[j][i];
            }
        }

        return new SquareMatrix(a);
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     *   1 2 3
     *   4 5 6
     *   7 8 9
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sb.append(String.format("%-5d ", data[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
