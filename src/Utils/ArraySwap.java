package Utils;

public class ArraySwap {
    public static void swap(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
