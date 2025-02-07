package oop_hus.midterm.vector;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayVector(double[] data) {
        this.data = data;
        this.size = data.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double coordinate(int index) {
        if(checkBoundaries(index, size)) {
            return data[index];
        }
        System.out.println("Index khong hop le");
        return 0.0;
    }

    @Override
    public double[] coordinates() {
        return coordinates();
    }

    @Override
    public void set(double value, int index) {
        if(checkBoundaries(index, size)) {
            data[index] = value;
        }
        else {
            System.out.println("Wrong index !!!");
        }
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyArrayVector add(double value) {
        double[] newData = new double[size];
        for(int i = 0; i < size; ++i) {
            newData[i] =  data[i] + value;
        }
        return new MyArrayVector(newData);
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyArrayVector add(MyVector another) {
        double[] newData = new double[size];
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                newData[i] = data[i] + another.coordinate(i);
            }
        }
        return new MyArrayVector(newData);
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(double value) {
       for(int i = 0; i < size(); ++i) {
            data[i] += value;
       }
        return this;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(MyVector another) {
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                this.set(this.coordinate(i) + another.coordinate(i), i);
            }
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector mới.
     */
    public MyArrayVector minus(double value) {
        double[] newData = new double[size];
        for(int i = 0; i < size; ++i) {
            newData[i] =  data[i] - value;
        }
        return new MyArrayVector(newData);
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyArrayVector minus(MyVector another) {
        double[] newData = new double[size];
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                newData[i] = data[i] - another.coordinate(i);
            }
        }
        return new MyArrayVector(newData);
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(double value) {
        for(int i = 0; i < size(); ++i) {
            data[i] += value;
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(MyVector another) {
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                this.set(this.coordinate(i) - another.coordinate(i), i);
            }
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyVector another) {
        double result = 0;
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                result += this.coordinate(i) * another.coordinate(i);
            }
        }
        return result;
    }

    /**
     * Các phần tử của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        for(int i = 0; i < size(); ++i) {
            this.set(Math.pow(this.coordinate(i), power), i);
        }
        return this;
    }

    /**
     * Các phần tử của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        for(int i = 0; i < size(); ++i) {
            this.set(this.coordinate(i) * value, i);
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        double length = 0;
        for(int i = 0; i < size; ++i) {
            length += data[i] * data[i];
        }
        return Math.sqrt(length);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        if(size == data.length) {
            enlarge();
        }
        data[size] = value;
        ++size;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        if(checkBoundaries(index, size)) {
            if (size == data.length) {
                enlarge();
            }
            for (int i = size - 1; i >= index; i--) {
                data[i+1] = data[i];
            }
            data[index] = value;
            size++;
        } else {
            System.out.println("Index is invalid");
        }
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        if(checkBoundaries(index, size)) {
            for(int i = index; i < size - 1; ++i ) {
                data[i] = data[i + 1];
            }
            data[size - 1] = 0.0;
            --size;
        } else {
            System.out.println("Index is invalid");
        }
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        double[] newData = new double[indices.length];
        for(int i = 0; i < newData.length; ++i) {
            newData[i] = data[indices[i]];
        }
        return new MyArrayVector(newData);
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        double[] newData = new double[size * 2];
        for (int i = 0; i < size; ++i) {
            newData[i] = data[i];
        }
        data = newData;
        return this;
    }
}
