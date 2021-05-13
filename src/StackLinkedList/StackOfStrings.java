package StackLinkedList;

import java.util.EmptyStackException;

public class StackOfStrings {

    private Node first = null;

    private static class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node head = new Node(item);
        head.next = first;
        first = head;
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        String item = first.item;
        first = first.next;
        return item;

    }

}
