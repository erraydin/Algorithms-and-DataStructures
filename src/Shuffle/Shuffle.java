package Shuffle;

import java.util.Random;

public class Shuffle {
    public static void shuffle(Object[] a) {
        for (int i=0; i < a.length; i++) {
            int randomIndex = new Random().nextInt(i + 1);
            swap(a, i, randomIndex);

        }
    }

    private static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
