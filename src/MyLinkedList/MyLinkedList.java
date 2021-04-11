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
        System.out.println();
    }

    public void print2() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
        }
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getElement() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    public void addAfter(Node node, int AfterValue) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.getElement() == AfterValue) {
                node.setNext(tmp.getNext());
                tmp.setNext(node);
                size++;
                return;
            }
            tmp = tmp.getNext();
        }
    }

    /**
     * удаление элемента списка по его индексу
     *
     * @param index - индекс элемента
     * @return возращаемое значение это удаляемый элемент
     */
    public int deleteByIndex(int index) {
        Node temp = head;
        int deletedElement = 0;
        for (int i = 0; i < size; i++) {
            if (i == index - 1) {
                deletedElement = temp.getNext().getElement();
                temp.setNext(temp.getNext().getNext());
                size--;
            } else if (index == 0) {
                head = head.getNext();
                size--;
                return 0;
            }
            temp = temp.getNext();
        }
        return deletedElement;
    }

    /**
     * удаляем элемент списка по значению
     *
     * @param value значение которое будем удалять
     * @return возвращает тру или фолс. Тру если если удалили успешно. Фолс если ничего не удаляли
     */
    public boolean deleteByElement(int value) {
        Node temp = head;
        boolean result = false;
        for (int i = 0; i < size; i++) {
            try {
                if (temp.getNext().getElement() == value) {
                    temp.setNext(temp.getNext().getNext());
                    size--;
                    result = true;
                } else if (temp.getElement() == value){
                    head = head.getNext();
                    size--;
                }
                temp = temp.getNext();
            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception has been caught!");
            }

        }
        return result;
    }

    public void removeByValue(int RemoveValue) {
        Node temp = head;
        for (int i = 0; i <= size; i++) {
            try {
                if (temp.getNext().getElement() == RemoveValue) {
                    temp.setNext(temp.getNext().getNext());
                    size--;
                }
                temp = temp.getNext();
            } catch (NullPointerException e) {

            }

        }
    }

    public void removeLast() throws NullPointerException {
        Node temp = head;
        for (int i = 0; i <= size; i++) {
            try {
                if (temp.getNext().getNext() == null) {
                    temp.setNext(null);
                    size--;
                }
                temp = temp.getNext();
            } catch (NullPointerException e) {
            }

        }
    }

    public void removeAll() {
        head.setNext(null);
        head.setElement(null);
        size = 0;
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
