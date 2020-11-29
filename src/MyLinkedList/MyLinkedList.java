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

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tmp.getElement() + " ");
            tmp = tmp.getNext();
        }

    }

    public void addAfter(Node node, int value) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.getElement() == value) {
                node.setNext(tmp.getNext());
                tmp.setNext(node);
                size++;
                return;
            }
            tmp = tmp.getNext();
        }
    }

    public void removeFirst() {
        head = head.getNext();
        size--;
    }

    public int getFirst() {
        return head.getElement();
    }

    public int getLast() {
        return tail.getElement();
    }

    public int getSize() {
        return size;
    }
}

