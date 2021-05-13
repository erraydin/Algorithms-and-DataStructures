package StackArray;

import java.util.EmptyStackException;

public class StackOfStrings {
    private String[] stack;
    private int index;

    public StackOfStrings(int capacity) {
        stack = new String[capacity];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void push(String item) {
        //first use index, then increment
        stack[index++] = item;
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        //first decrement, then use index
        return stack[--index];
    }
}
