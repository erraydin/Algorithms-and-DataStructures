package QueueLinkedList;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueOfStrings queue = new QueueOfStrings();
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.enqueue("item3");
        queue.enqueue("item4");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("item5");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Deneme");
    }
}
