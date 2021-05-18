package DynamicMedian;

public class TestDynamicMedian {
    public static void main(String[] args) {
        DynamicMedian dm = new DynamicMedian();
        // [1 2 2 3 4 5 5]
        dm.insert(5);
        dm.insert(2);
        dm.insert(3);
        dm.insert(4);
        dm.insert(5);
        dm.insert(1);
        dm.insert(2);

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");

        System.out.println(dm.median());
        System.out.println(dm.removeMedian() + "\n");


    }
}
