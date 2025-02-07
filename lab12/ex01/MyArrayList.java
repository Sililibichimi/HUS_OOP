package oop_hus.lab12.ex01;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        if (checkBoundaries(index, size)) {
            return data[index];
        }
        return null;
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if (checkBoundaries(index, size)) {
            for (int i = index; i < size - 1; ++i) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            --size;
        }
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (size == data.length) {
            enlarge();
        }
        data[size] = payload;
        ++size;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (size == data.length) {
            enlarge();
        }
        for (int i = size; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = payload;
        ++size;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(data);
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] newData = new Object[size * 2];
        for (int i = 0; i < size; ++i) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
