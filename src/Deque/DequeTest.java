package Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque<String> deque = new Deque<String>();
        System.out.println("Initialized an empty deque: " + deque);

        deque.addFirst("item 4");
        System.out.println("Added the element 'item 4' to the beginning: " + deque);

        deque.addFirst("item 3");
        System.out.println("Added the element 'item 3' to the beginning: " + deque);

        deque.addLast("item 5");
        System.out.println("Added the element 'item 5' to the end: " + deque);

        deque.addLast("item 6");
        System.out.println("Added the element 'item 6' to the end: " + deque);

        deque.removeFirst();
        System.out.println("Removed the first element: " + deque);

        deque.removeLast();
        System.out.println("Removed the last element: " + deque);

        System.out.println("Currently the size of the deque is: " + deque.size());
        System.out.println("'The deque is empty' is a " + deque.isEmpty() +" statement.");


    }
}
