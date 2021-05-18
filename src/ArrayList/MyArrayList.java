package ArrayList;

import Utils.ArraySwap;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyArrayList<Key> {
    private Key[] list;
    private int index;

    public MyArrayList() {
        list = (Key[]) new Object[8];
        index = 0;
    }

    public boolean isEmpty() {return index == 0;}

    public int size() {return index;}

    public Key get(int i) {
        if ( i >= size()) throw new IndexOutOfBoundsException();
        return list[i];
    }


    public void set(int i, Key v) {
        if ( i < 0 || i >= size() ) throw new IndexOutOfBoundsException();
        list[i] = v;
    }

    public void add(Key v) {
        if ( index == list.length ) resize(2 * list.length);
        list[index++] = v;
    }

    public Key pop() {
        if (isEmpty()) throw new EmptyStackException();
        Key res = list[--index];
        list[index] = null;
        if (index > 0 && index < list.length / 4) resize(list.length / 2);
        return res;
    }

    public void swap(int i, int j) {
        ArraySwap.swap(list, i, j);
    }

    private void resize(int capacity) {
        Key[] newList = (Key[]) new Object[capacity];
        for (int i = 0; i < index; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    //For test only
    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
