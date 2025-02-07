package oop_hus.lab12.ex01;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        MyIterator it = data.iterator();
        double max = (double) it.next();
        while (it.hasNext()) {
            max = Math.max(max, (double)it.next());
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        double min = (double) data.get(0);
        for (int i = 1; i < data.size(); ++i) {
            min = Math.min(min, (double) data.get(i));
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        double mean = 0;
        for (int i = 0; i < data.size(); ++i) {
            mean += (double) data.get(i);
        }
        return mean / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        double var = 0;
        double mean = mean();
        for (int i = 0; i < data.size(); ++i) {
            var += ((double) data.get(i) - mean) * ((double) data.get(i) - mean);
        }
        return Math.sqrt(var / data.size());
    }
}
