package PriorityQueue;

import ArrayList.MyArrayList;

import java.util.EmptyStackException;

public class MaxPQ<Key extends Comparable<Key>> {
    private final MyArrayList<Key> pq;
    //number of elements
    private int N;

    public MaxPQ() {
        pq = new MyArrayList<>();
        //Because 1-indexed, we put auxiliary null in 0th index
        pq.add(null);
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(Key v) {
        N++;
        pq.add(v);
        swim(N);
    }

    public Key delMax() {
        if (isEmpty()) throw new EmptyStackException();
        pq.swap(1, N);
        Key result = pq.pop();
        N--;
        if ( !isEmpty() ) {
            sink(1);
        }
        return result;
    }

    public Key max() {
        if (size() == 0) throw new EmptyStackException();
        return pq.get(1);
    }


    //When element at index i is smaller than its parent
    //You move it up until it is not
    private void swim(int i) {
        while ( i > 1 && less(i / 2, i)) {
            pq.swap(i, i/2);
            i = i / 2;
        }
    }

    //When an element is larger than one or both of its children
    // You swap it with the smaller of its children
    // this helps you to remove the min element (index 1)
    public void sink(int i) {
        //means that i has at leas one child
        while (2 * i <= N) {
            int j = 2 * i;
            // Second child exists and smaller
            if (j < N && less(j, j + 1)){
                j++;
            }
            if (!less(i, j)) break;

            //At this point j is the smaller child
            pq.swap(i, j);
            i = j;
        }
    }

    private boolean less(int i, int j) {
        return pq.get(i).compareTo(pq.get(j)) < 0;
    }

    //For test only
    @Override
    public String toString() {
        return pq.toString();
    }
}
