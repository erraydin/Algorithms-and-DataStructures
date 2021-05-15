package QueueArray;

import java.util.Arrays;

public class Queue<Item> {
    Item[] queue;
    int dequeIndex;
    int enqueueIndex;

    public Queue(){
        queue = (Item[]) new Object[8];
        dequeIndex = 0;
        enqueueIndex = 0;
    }

    public boolean isEmpty() {
        return dequeIndex == enqueueIndex;
    }


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
        dequeIndex++;
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
}
