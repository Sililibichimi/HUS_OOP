package oop_hus.lab11.iterator.ex3;

public class MyLinkedListIterator implements MyIterator {
    private MyLinkedListNode currentNode;

    public MyLinkedListIterator(MyLinkedListNode node) {
        this.currentNode = node;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Object object = currentNode.getPayload();
            currentNode = currentNode.getNext();
            return object;
        }
        return null;
    }
}
