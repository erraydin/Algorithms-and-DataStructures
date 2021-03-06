package QueueArray;

import java.util.Arrays;
import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
    private Item[] queue;
    private int dequeIndex;
    private int enqueueIndex;

    public Queue(){
        queue = (Item[]) new Object[8];
        dequeIndex = 0;
        enqueueIndex = 0;
    }

    public boolean isEmpty() {
        return dequeIndex == enqueueIndex;
    }

    /*
    *
    * [null  null  null   2]
    *   e
    *                     d
    *
    * */
    public void enqueue(Item item) {
        queue[enqueueIndex] = item;
        if ((enqueueIndex + 1) % queue.length == dequeIndex) {
            resize(2 * queue.length);
        } else {
            enqueueIndex = (enqueueIndex + 1) % queue.length;
        }


    }

    public Item dequeue() {
        if (queue.length >= 8 && enqueueIndex - dequeIndex < queue.length / 4) {
            resize(queue.length / 2);
        }
        Item res = queue[dequeIndex];
        queue[dequeIndex] = null;
        dequeIndex = (dequeIndex + 1) % queue.length;
        return res;
    }


    private void resize(int capacity) {
        Item[] newQueue = (Item[]) new Object[capacity];
        int index = dequeIndex;
        int size = size();
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[index];
            index = (index + 1) % queue.length;
        }
        enqueueIndex = size;
        dequeIndex = 0;
        queue = newQueue;

    }

    public int size() {
        int temp = enqueueIndex - dequeIndex;

        if (temp >= 0) {
            return temp;
        } else  {
            return temp + queue.length + 1;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(queue) + " d: " + dequeIndex + " e: " + enqueueIndex;
    }

    @Override
    public Iterator<Item> iterator() { return new Iterator<Item>() {
        private int index = dequeIndex;
        @Override
        public boolean hasNext() {
            return index != enqueueIndex;
        }

        @Override
        public Item next() {
            if (!hasNext()) {throw new IndexOutOfBoundsException();}
            return queue[index++];
        }
    };
    }
}
