package PriorityQueue;

//Key extends Comparable<Key> means that we want a generic type Key which is comparable
public class MinPQ<Key extends Comparable<Key>> {
    public MinPQ() {}
    public MinPQ(Key[] a) {}

    public boolean isEmpty() { return true; }
    public int size() {return 0;}
    public void insert(Key v) {}
    public Key delMin() { return null; }
    public Key min() { return null; }

    private void swim(int k) {}
    private void sink(int k) {}

    private boolean less(int i, int j) {
        return true;
    }



}
