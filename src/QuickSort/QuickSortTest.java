package QuickSort;

import Shuffle.Shuffle;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17};
        Shuffle.shuffle(a);
        System.out.println(Arrays.toString(a));

        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
