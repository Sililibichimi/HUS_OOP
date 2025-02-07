package oop_hus.midterm.vector;

import java.util.LinkedList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        data = new LinkedList<>();
    }

    public MyListVector(List<Double> data) {
        this.data = data;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        double[] dataArray = new double[data.size()];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = data.get(i);
        }
        return dataArray;
    }

    @Override
    public void set(double value, int index) {
        data.set(index, value);
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyListVector add(double value) {
        List<Double> newData = new LinkedList<>();
        for(int i = 0; i < size(); ++i) {
            newData.add(i, data.get(i) + value);
        }
        return new MyListVector(newData);
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyListVector add(MyVector another) {
        if(data.size() == another.size()) {
            List<Double> newData = new LinkedList<>();
            for(int i = 0; i < size(); ++i) {
                newData.add(i, this.coordinate(i) + another.coordinate(i));
            }
            return new MyListVector(newData);
        }
        else {
            System.out.println("Two vectors don't have the same size");
        }
        return null;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector addTo(double value) {
        for(int i = 0; i < size(); ++i) {
            data.set(i, data.get(i) + value);
        }
        return this;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector addTo(MyVector another) {
        if(data.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                data.add(i, data.get(i) + another.coordinate(i));
            }
            return this;
        }
        else {
            System.out.println("Two vectors don't have the same size");
        }
        return null;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector mới.
     */
    public MyListVector minus(double value) {
        List<Double> newData = new LinkedList<>();
        for(int i = 0; i < size(); ++i) {
            newData.add(i, data.get(i) - value);
        }
        return new MyListVector(newData);
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyListVector minus(MyVector another) {
        if(data.size() == another.size()) {
            List<Double> newData = new LinkedList<>();
            for(int i = 0; i < size(); ++i) {
                newData.add(i, data.get(i) - another.coordinate(i));
            }
            return new MyListVector(newData);
        }
        else {
            System.out.println("Two vectors don't have the same size");
        }
        return null;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(double value) {
        for(int i = 0; i < size(); ++i) {
            data.set(i, data.get(i) - value);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(MyVector another) {
        if(data.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                data.add(i, data.get(i) - another.coordinate(i));
            }
            return this;
        }
        else {
            System.out.println("Two vectors don't have the same size");
        }
        return null;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return tích vô hướng.
     */
    public double dot(MyVector another) {
        double result = 0;
        if(data.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                result += this.coordinate(i) * another.coordinate(i);
            }
        }
        else {
            System.out.println("Two vectors don't have the same size");
        }
        return result;
    }

    /**
     * Các phần tử vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        for(int i = 0; i < size(); ++i) {
            data.set(i, Math.pow(data.get(i), power));
        }
        return this;
    }

    /**
     * Các phần tử vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        for(int i = 0; i < size(); ++i) {
            data.set(i, data.get(i) * value);
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        double res = 0.0;
        for(int i = 0; i < size(); ++i) {
            res += data.get(i) * data.get(i);
        }
        return res;
    }

    /**
     * Thêm một giá trị value vào vector ở vị trí cuối cùng.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        data.addLast(value);
        return this;
    }

    /**
     * Thêm một giá trị vào vector ở vị trí index.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        if(checkBoundaries(index, size())) {
            data.add(index, value);
        } else {
            System.out.println("Invalid index");
        }
        return this;
    }

    /**
     * Xóa phần tử ở vị trí index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        if(checkBoundaries(index, size())) {
            data.remove(index);
        } else {
            System.out.println("Invalid index");
        }
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các phần tử
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có kiểu MyListVector có các phần tử được trích xuất từ vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        List<Double> newData = new LinkedList<>();
        for(int i = 0; i < indices.length; ++i) {
            if(checkBoundaries(indices[i], size())) {
                newData.addLast(data.get(indices[i]));
            } else {
                System.out.println("invalid index");
                return null;
            }
        }
        return new MyListVector(newData);
    }
}
