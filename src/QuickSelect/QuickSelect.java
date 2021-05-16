package QuickSelect;

import Shuffle.Shuffle;
import Utils.ArraySwap;

import java.util.Arrays;

// Linear in average, quadratic in the worst case
public class QuickSelect {
    //Finds kth smallest element
    public static Comparable select(Comparable[] a, int k) {
        Shuffle.shuffle(a);
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int pivot = partition(a, low, high);

            if (k - 1 < pivot) {
                high = pivot - 1;
            } else if (k > pivot) {
                low = pivot + 1;
            } else {
                return a[k - 1];
            }
        }
        return a[k - 1];
    }

    private static int partition(Comparable[] a, int start, int end) {

        int i = start + 1;
        int j = end;

        while (true) {
            while (a[i].compareTo(a[start]) <= 0) {
                i++;
                if (i > j) break;
            }

            while (a[j].compareTo(a[start]) >= 0) {
                j--;
                if (i > j) break;
            }

            if (i > j) break;
            ArraySwap.swap(a, i, j);
        }

        ArraySwap.swap(a, start, j);
        return j;

    }
}
