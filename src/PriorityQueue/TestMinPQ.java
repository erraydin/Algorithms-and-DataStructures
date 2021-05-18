package PriorityQueue;

public class TestMinPQ {
    public static void main(String[] args) {
        MinPQ<Integer> pq = new MinPQ<>();
        pq.insert(5);
        pq.insert(2);
        pq.insert(2);
        pq.insert(3);
        pq.insert(3);
        pq.insert(1);
        pq.insert(5);
        System.out.println("pq now is: \n");
        System.out.println(pq.toString());

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");

        System.out.println("popped " + pq.delMin() + " , pq now is:");
        System.out.println(pq.toString() + "\n");


    }
}
