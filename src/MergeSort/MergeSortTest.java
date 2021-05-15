package MergeSort;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] array  = {5, 11, 0, 3, 4, 8, 1, 9, 2, 7, 6, 10};

        System.out.println(Arrays.toString(array));
        MergeSort.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                else if (o1 < o2) return -1;
                else return 0;
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
