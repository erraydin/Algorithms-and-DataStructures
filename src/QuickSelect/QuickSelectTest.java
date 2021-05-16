package QuickSelect;

import Shuffle.Shuffle;

public class QuickSelectTest {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Shuffle.shuffle(a);
        System.out.println(QuickSelect.select(a, 5));
    }
}
