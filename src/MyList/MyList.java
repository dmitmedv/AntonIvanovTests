package MyList;

public class MyList {
    private int size = 0;
    private Integer elements[];

    public MyList() {
        elements = new Integer[3];
    }

    public void add(Integer integer) {
        elements[size] = integer;
        size++;
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
