package oop_hus.finalexam.book;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public Object next() {
            Object data = getNodeByIndex(currentPosition).getData();
            currentPosition++;
            return data;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        if(checkBoundaries(index, size)){
            getNodeByIndex(index).setData(data);
        }
        else {
            System.out.println("Index out of bound");
        }
    }

    @Override
    public Object get(int index) {
        if(checkBoundaries(index, size)){
            return getNodeByIndex(index).getData();
        }
        return null;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node cur = getNodeByIndex(size - 1);
            cur.setNext(new Node(value));
        }
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        if (checkBoundaries(index, size + 1)) {
            if (index == 0) {
                insertAtStart(value);
            } else if (index == size) {
                insertAtEnd(value);
            } else {
                Node cur = getNodeByIndex(index - 1);
                Node newNode = new Node(value);
                newNode.setNext(cur.getNext());
                cur.setNext(newNode);
            }
            size++;
        } else {
            System.out.println("Index out of bound");
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        if(checkBoundaries(index, size)){
            if(index == 0){
                head = head.getNext();
            }
            else {
                Node cur = getNodeByIndex(index - 1);
                cur.setNext(cur.getNext().getNext());
            }
            size--;
        }
        else {
            System.out.println("Index out of bound");
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        if (checkBoundaries(index, size)) {
            Node cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.getNext();
            }
            return cur;
        }
        return null;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(0);
    }
}
