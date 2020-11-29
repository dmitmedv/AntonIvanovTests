import MyLinkedList.*;

public class Main {

    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(new Node(22, null));
        myLinkedList.addFirst(new Node(60, null));
        myLinkedList.addLast(new Node(80, null));
        myLinkedList.addFirst(new Node((70), null));
        myLinkedList.getFirst();
        myLinkedList.getLast();
        myLinkedList.getSize();
        myLinkedList.addAfter(new Node(33, null),22);
        myLinkedList.removeFirst();
        myLinkedList.print();
    }
}
