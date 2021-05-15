package QuickSort;

import Shuffle.Shuffle;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 2, 2, 3, 3, 3, 8, 9, 10, 11, 11, 11, 14, 14, 16,17};
        Shuffle.shuffle(a);
        System.out.println(Arrays.toString(a));

        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
