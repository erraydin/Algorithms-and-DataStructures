package RandomizedQueue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item> {
    private Item[] queue;
    private int lastIndex;
    // construct an empty randomized queue
    public RandomizedQueue() {
        queue = (Item[]) new Object[8];
        lastIndex = -1;
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return lastIndex == -1;
    }

    // return the number of items on the randomized queue
    public int size() {
        return lastIndex + 1;
    }

    // add the item
    public void enqueue(Item item){
        if (item == null) throw new IllegalArgumentException();
        if (lastIndex == queue.length - 1) {
            resize(2 * queue.length);
        }
        queue[++lastIndex] = item;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        if (lastIndex < queue.length / 4) {
            resize(queue.length / 2);
        }

        int dequeueIndex = new Random().nextInt(lastIndex + 1);
        Item res = queue[dequeueIndex];
        queue[dequeueIndex] = queue[lastIndex];
        queue[lastIndex--] = null;
        return res;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        int randomIndex = new Random().nextInt(lastIndex + 1);
        return queue[randomIndex];
    }

    private void resize(int capacity) {
        Item[] newQueue = (Item[]) new Object[capacity];
        for (int i = 0; i <= lastIndex; i++){
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

    //Only for testing
    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
