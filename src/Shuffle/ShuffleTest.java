package Shuffle;

import java.util.Arrays;

public class ShuffleTest {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6};
        Shuffle.shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
