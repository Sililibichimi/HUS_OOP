package oop_hus.lab11.iterator.ex3;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return this.payload;
    }

    public MyLinkedListNode getNext() {
        return this.next;
    }

    public void setNext(MyLinkedListNode node) {
        this.next = node;
    }
}
