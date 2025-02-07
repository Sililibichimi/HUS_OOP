package oop_hus.finalexam.candidate;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    
    /**
     * Lấy kích thước của list.
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     */
    @Override
    public Object get(int index) {
        if (checkBoundaries(index, size)) {
            return data[index];
        }
        return null;
    }

    @Override
    public void set(Object payload, int index) {
        this.data[index] = payload;
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
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
     */
    @Override
    public void append(Object payload) {
        if (this.size == this.data.length) {
            enlarge();
        }

        this.data[this.size] = payload;
        this.size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     */
    @Override
    public void insert(Object payload, int index) {
        if (this.size == this.data.length) {
            enlarge();
        }

        Object[] array = this.data.clone();
        this.data[index] = payload;
        this.size++;
        System.arraycopy(array, index, this.data, index + 1, array.length - 1 - index);
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     */
    @Override
    public MyIterator iterator() {
        Object[] outerData = this.data;
        return new MyIterator() {
            private int index = 0;
            private Object[] data = outerData;

            @Override
            public boolean hasNext() {
                return index < size - 1;
            }

            @Override
            public Object next() {
                Object cur = data[index];
                ++index;
                return cur;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] newArray = new Object[2 * this.data.length];
        System.arraycopy(this.data, 0, newArray, 0, this.data.length);
        this.data = newArray;
    }
}
