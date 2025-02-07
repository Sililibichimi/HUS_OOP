package oop_hus.finalexam.search;

public class BubbleSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Bubble sort.
     * @param data
     * @param order: true sắp xếp theo thứ tự tăng dần, false sắp xếp theo thứ tự giảm dần.
     */
    @Override
    public void sort(double[] data, boolean order) {
        if (order) {
            sortAscending(data);
        } else {
            sortDescending(data);
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - i - 1; j++) {
                if(data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - i - 1; j++) {
                if(data[j] < data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    private void swap(double[] data, int i, int j) {
        double temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
