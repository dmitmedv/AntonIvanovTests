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
        for (int i = 0; i < size; i++) {
            sb.append(elements[i] + "\n");
        }
        return sb.toString();
    }
}
