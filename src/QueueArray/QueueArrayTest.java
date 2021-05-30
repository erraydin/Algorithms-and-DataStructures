package QueueArray;

public class QueueArrayTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(0);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(1);
        System.out.println(queue);
        queue.enqueue(3);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(2);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
//        queue.enqueue(4);
        System.out.println(queue.isEmpty());

    }
}
