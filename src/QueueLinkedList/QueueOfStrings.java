package QueueLinkedList;


import java.util.EmptyStackException;

public class QueueOfStrings {
    private final Node dummyHead = new Node("");
    private Node last = dummyHead;

    private static class Node {
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
        }
    }

    public boolean isEmpty() {
        return dummyHead.next == null;
    }

    public void enqueue(String item) {
        last.next = new Node(item);
        last = last.next;
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        String ans = dummyHead.next.item;
        dummyHead.next = dummyHead.next.next;
        return ans;
    }
}
