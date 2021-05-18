package ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list);

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(list);
        list.set(2, 7);
        System.out.println(list);
        list.set(4, 7);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

    }
}
