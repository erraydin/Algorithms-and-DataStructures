package RandomizedQueue;

public class RandomizedQueueTest {
    public static void main(String[] args) {
        RandomizedQueue<String> queue = new RandomizedQueue<String>();
        queue.enqueue("item 1");
        queue.enqueue("item 2");
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

        queue.enqueue("item 3");
        queue.enqueue("item 4");
        queue.enqueue("item 5");
        queue.enqueue("item 6");

        System.out.println(queue);

        queue.enqueue("item 7");
        System.out.println(queue);

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);

    }
}
