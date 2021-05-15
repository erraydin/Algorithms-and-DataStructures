package StackLinkedList;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.ListIterator;

// You make it iterable so it supports for (Item item : stack) language
public class Stack<Item> implements Iterable<Item> {

    private Node first = null;

    private class Node {
        Item item;
        Node next;
        public Node(Item item) {
            this.item = item;
        }
    }

    public Iterator<Item> iterator() {return new Iterator<Item>() {
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) {throw new IndexOutOfBoundsException();}
            Item item = current.item;
            current = current.next;
            return item;
        }
    };
    }



    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node head = new Node(item);
        head.next = first;
        first = head;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Item item = first.item;
        first = first.next;
        return item;

    }

}
