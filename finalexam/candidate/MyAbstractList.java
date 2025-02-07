package oop_hus.finalexam.candidate;

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
        for (int i = 0; i < this.size(); i++) {
            sb.append(String.format("[%s] ", this.get(i).toString()));
        }
        return sb.toString();
    }
}
