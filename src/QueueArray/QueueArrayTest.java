package QueueArray;

public class QueueArrayTest {
    public static void main(String[] args) {
        QueueOfStrings queue = new QueueOfStrings();
        System.out.println(queue.toString());
        queue.enqueue("1");
        System.out.println(queue.toString());
        queue.enqueue("2");
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.enqueue("1");
        System.out.println(queue.toString());
        queue.enqueue("2");
        System.out.println(queue.toString());
        queue.enqueue("3");
        System.out.println(queue.toString());
        queue.enqueue("4");
        System.out.println(queue.toString());
        queue.enqueue("5");
        System.out.println(queue.toString());

        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());

    }
}
