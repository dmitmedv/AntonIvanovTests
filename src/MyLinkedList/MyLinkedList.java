package MyLinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(Node node) {
        if (tail == null) {
            tail = node;
        }
        node.setNext(head); //актуально начиная со второго и далее элемента
        head = node;
        size++;
    }

    public void addLast(Node node) {
        tail.setNext(node);
        tail = node;
        size++;

    }
}

