package MergeSort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] array  = {5, 11, 0, 3, 4, 8, 1, 9, 2, 7, 6, 10};

        System.out.println(Arrays.toString(array));
        MergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
