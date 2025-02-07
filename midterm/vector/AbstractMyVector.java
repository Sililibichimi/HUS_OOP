package oop_hus.midterm.vector;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size() - 1; ++i) {
            sb.append(coordinate(i)).append(" ");
        }
        sb.append(coordinate(size() - 1)).append("]");
        return sb.toString();
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có các phần tử bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        if(this.size() == another.size()) {
            for(int i = 0; i < size(); ++i) {
                if(this.coordinate(i) != another.coordinate(i)) {
                    return false;
                }
            }
        } else {
            return  false;
        }
        return true;
    }

    public boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index < limit;
    }
}
