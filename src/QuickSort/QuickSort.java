package QuickSort;

import Shuffle.Shuffle;
import Utils.ArraySwap;

public class QuickSort {
    public static void sort(Comparable[] a) {
        Shuffle.shuffle(a);
        sortHelper(a, 0, a.length - 1);

    }

    private static void sortHelper(Comparable[] a, int low, int high) {
        if (low >= high) return;

        // 3-way partitioning
        //  [  < v |  =v  |    | > v]
        //         lt     i    gt
        int lt = low;
        int gt = high;
        Comparable v = a[low];
        int i = low + 1;

        while (i <= gt) {
            int comparison = a[i].compareTo(v);
            if (comparison < 0) ArraySwap.swap(a, lt++, i++);
            else if (comparison > 0) ArraySwap.swap(a, i, gt--);
            else i++;
        }

        sortHelper(a, low, lt - 1);
        sortHelper(a, gt + 1, high);

    }
    //regular partition, not very good when there are a lot of duplicates
//    private static int partition(Comparable[] a, int start, int end) {
//
//        int i = start + 1;
//        int j = end;
//
//        while (true) {
//            while (a[i].compareTo(a[start]) <= 0) {
//                i++;
//                if (i > j) break;
//            }
//
//            while (a[j].compareTo(a[start]) >= 0) {
//                j--;
//                if (i > j) break;
//            }
//
//            if (i > j) break;
//            ArraySwap.swap(a, i, j);
//        }
//
//        ArraySwap.swap(a, start, j);
//        return j;
//
//    }


}
