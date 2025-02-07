package oop_hus.lab12.ex01;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     *
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */

    boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index < limit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < size(); ++index) {
            System.out.println(get(index) + " " + index);
            sb.append(String.format("[%s] ", this.get(index).toString()));
        }
        return sb.toString();
    }
}
