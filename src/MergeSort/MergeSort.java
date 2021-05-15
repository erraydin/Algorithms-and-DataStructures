package MergeSort;

import java.util.Comparator;

public class MergeSort {
    public static void sort(Object[] a, Comparator comparator) {
        Object[] aux = new Object[a.length];
        sortHelper(a, aux, 0, a.length - 1, comparator);

    }

    private static void sortHelper(Object[] a, Object[] aux, int low, int high, Comparator comparator) {
        if (high <= low) return;

        int mid = low + (high - low) / 2;
        sortHelper(a, aux, low, mid, comparator);
        sortHelper(a, aux, mid + 1, high, comparator);
        merge(a, aux, low, mid, high, comparator);
    }

    private static void merge(Object[] a, Object[] aux, int low, int mid, int high, Comparator comparator) {

        for (int i = low; i <= high; i++) {
            aux[i] = a[i];
        }

        int i = low;
        int j = mid + 1;

        for (int k = low; k<= high; k++) {
            if ( i > mid )   a[k] = aux[j++];
            else if ( j > high )  a[k] = aux[i++];
            else if (comparator.compare(aux[i], aux[j]) <= 0) a[k] = aux[i++];
            else a[k] = aux[j++];

        }

    }



}
