package Deque;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    private final Node dummyHead;
    private final Node dummyTail;
    private int size;

    private class Node {
        Item val;
        Node next;
        Node prev;
        public Node(){}
        public Node(Item item){val = item;}
    }

    // construct an empty deque
    public Deque() {
        dummyHead = new Node();
        dummyTail = new Node();
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
        size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) throw new IllegalArgumentException();
        Node newHead = new Node(item);
        newHead.next = dummyHead.next;
        dummyHead.next.prev = newHead;
        dummyHead.next = newHead;
        newHead.prev = dummyHead;
        size++;

    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) throw new IllegalArgumentException();
        Node newTail = new Node(item);
        newTail.prev = dummyTail.prev;
        dummyTail.prev.next = newTail;
        dummyTail.prev = newTail;
        newTail.next = dummyTail;
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Item first = dummyHead.next.val;
        dummyHead.next = dummyHead.next.next;
        dummyHead.next.prev = dummyHead;
        size--;
        return first;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Item last = dummyTail.prev.val;
        dummyTail.prev = dummyTail.prev.prev;
        dummyTail.prev.next = dummyTail;
        size--;
        return last;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {return new Iterator<Item>() {
        Node current = dummyHead;
        @Override
        public boolean hasNext() {
            return current.next != dummyTail;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            current = current.next;
            return current.val;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Item item : this) {
            stringBuilder.append(item);
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


}
