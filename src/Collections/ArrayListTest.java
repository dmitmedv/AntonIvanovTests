package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void print() {
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public String toString() {
                System.out.println("It's overriding!");
                return super.toString();
            }
        };
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(0);
        list.add(1);
        list.add(9);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i : list) {
            System.out.print(i + " ");
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
