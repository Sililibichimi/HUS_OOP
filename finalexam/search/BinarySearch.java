package oop_hus.finalexam.search;

public class BinarySearch implements Search {
    private static BinarySearch instance;
    private Sorter sorter;

    private BinarySearch() {
    }

    /**
     * Tạo đối tượng BinarySearch.
     * @return
     */
    public static BinarySearch getInstance() {
        if (instance == null) {
            instance = new BinarySearch();
        }
        return instance;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public int search(double[] data, double value) {
        sort(data);
        return binarySearch(data, value);
    }

    private int binarySearch(double[] data, double value) {
        int left = 0;
        int right = data.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(data[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return data[left] == value ? left : -1;
    }

    private void sort(double[] data) {
        sorter.sort(data, true);
    }

    public static void print(double[] data) {
        System.out.print("[");
        for (double d : data) {
            System.out.print(d + " ");
        }
        System.out.print("]\n");
    }

}
