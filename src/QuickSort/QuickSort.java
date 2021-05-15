package QuickSort;

public class QuickSort {
    public static void sort(Comparable[] a) {

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
            swap(a, i, j);
        }

        swap(a, start, j);
        return j;

    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}