package oop_hus.lab12.ex01;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
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
        return getNodeByIndex(index) == null ? null : getNodeByIndex(index).getPayload();
    }


    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if (checkBoundaries(index, size)) {
            MyLinkedListNode cur = getNodeByIndex(index - 1);
            cur.setNext(cur.getNext().getNext());
        }
        --size;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (size == 0) {
            head = newNode;
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(newNode);
        }
        this.size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (checkBoundaries(index, size)) {
            if (index == size - 1) {
                append(payload);
            } else {
                MyLinkedListNode prev = getNodeByIndex(index - 1);
                MyLinkedListNode next = getNodeByIndex(index);
                MyLinkedListNode newNode = new MyLinkedListNode(payload);
                prev.setNext(newNode);
                newNode.setNext(next);
            }
            ++size;
        } else {
            System.out.println("Cannot insert");
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (checkBoundaries(index, size)) {
            MyLinkedListNode res = this.head;
            for (int i = 0; i < index; ++i) {
                res = res.getNext();
            }
            return res;
        }
        return null;
    }
}
