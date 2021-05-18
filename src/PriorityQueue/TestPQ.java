package PriorityQueue;

import MergeSort.MergeSort;

public class TestPQ {
    public static void main(String[] args) {
        /*########################################################
         * ################ Max PQ test ##########################
         * #########################################################*/
        MaxPQ<Integer> maxPQ = new MaxPQ<>();

        maxPQ.insert(1);
        maxPQ.insert(7);
        maxPQ.insert(5);
        maxPQ.insert(6);
        maxPQ.insert(3);
        maxPQ.insert(2);
        maxPQ.insert(5);
        maxPQ.insert(6);
        maxPQ.insert(5);

        System.out.println("pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        System.out.println("Removed " + maxPQ.delMax() + " pq now is:");
        System.out.println(maxPQ.toString());

        /*--------------------><---------------------------------------*/


        /*########################################################
        * ################ Min PQ test ##########################
        * #########################################################*/
//        MinPQ<Integer> minPQ = new MinPQ<>();
//
//        minPQ.insert(1);
//        minPQ.insert(7);
//        minPQ.insert(5);
//        minPQ.insert(6);
//        minPQ.insert(3);
//        minPQ.insert(2);
//        minPQ.insert(5);
//        minPQ.insert(6);
//        minPQ.insert(5);
//
//        System.out.println("pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());
//
//        System.out.println("Removed " + minPQ.delMin() + " pq now is:");
//        System.out.println(minPQ.toString());


    }
}
