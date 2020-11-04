package MyList;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private Integer elements[];

    public MyList() {
        elements = new Integer[7];
    }

    public void add(Integer integer) {
        if (elements.length == size) {
            reSize();
        }
        elements[size] = integer;
        size++;
    }

    public void reSize() {
        int newSize = elements.length+10;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int allSize() {
        return size;
    }

    public Integer get(int index) {
        return elements[index];
    }
	public int getLastElement() {
        return elements[size - 1];
    }

    public int getFirstElement() {
        return elements[0];
    }

    public void countPositive() {
        int count=0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public Integer remove(int index) {
        Integer item = elements[index];
        int number = elements.length - (index + 1);
        System.arraycopy(elements, index + 1, elements, index, number);
        size--;
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String start = "[";
        String end = "]";
        String delimetr = "; ";
        sb.append(start);
        for (int i = 0; i < size; i++) {
            if (i != elements.length - 1) {
                sb.append(elements[i]).append(delimetr);
            } else if (i == elements.length - 1) {
                sb.append(elements[i]);
            }
        }
        sb.append(end);
        return sb.toString();
    }

}
