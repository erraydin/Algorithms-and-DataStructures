package MergeSort;

public class MergeSort {
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sortHelper(a, aux, 0, a.length - 1);

    }

    private static void sortHelper(Comparable[] a, Comparable[] aux, int low, int high) {
        if (high <= low) return;

        int mid = low + (high - low) / 2;
        sortHelper(a, aux, low, mid);
        sortHelper(a, aux, mid + 1, high);
        merge(a, aux, low, mid, high);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {

        for (int i = low; i <= high; i++) {
            aux[i] = a[i];
        }

        int i = low;
        int j = mid + 1;

        for (int k = low; k<= high; k++) {
            if ( i > mid )   a[k] = aux[j++];
            else if ( j > high )  a[k] = aux[i++];
            else if (aux[i].compareTo(aux[j]) <= 0) a[k] = aux[i++];
            else a[k] = aux[j++];

        }

    }



}
