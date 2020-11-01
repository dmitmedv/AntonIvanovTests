import MyList.MyList;

public class Main {

    public static void main(String[] args) throws Exception {
        MyList list = new MyList();
        list.add(12);
        list.add(33);
        list.add(1);
        list.add(1);
        list.add(9);
        list.add(88);
        System.out.println(list);
        System.out.println(list.allSize());
        System.out.println(list.get(1));
        System.out.println("обновленный\n");
        list.remove(2);
        System.out.println(list);
    }
}