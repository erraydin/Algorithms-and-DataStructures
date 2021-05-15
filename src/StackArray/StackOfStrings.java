package StackArray;

import java.util.EmptyStackException;

public class StackOfStrings {
    private String[] stack;
    private int index;


    public StackOfStrings() {
        stack = new String[8];
        index = 0;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void push(String item) {

    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        //first decrement, then use index
        String item = stack[--index];
        stack[index] = null;

        if (index > 0 && index == stack.length / 4) {
            resize(stack.length / 2);
        }

        return item;
    }

    private void resize(int capacity) {
        String[] newStack = new String[capacity];
        for (int i = 0; i < index; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

}
