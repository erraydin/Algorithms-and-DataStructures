package BFS;

import Digraph.Digraph;

public class ShortestCycleDigraphTest {
    public static void main(String[] args) {
        Digraph dg = new Digraph(10);
        //first cycle
        dg.addEdge(0, 1);
        dg.addEdge(1, 2);
        dg.addEdge(2, 3);
        dg.addEdge(3, 0);


        //second cycle
        dg.addEdge(4, 5);
        dg.addEdge(5, 6);
        dg.addEdge(6, 4);

        //other edges
        dg.addEdge(3, 4);
        dg.addEdge(6, 0);

        dg.addEdge(8,9);
        dg.addEdge(7, 9);


        ShortestCycleDigraph sc = new ShortestCycleDigraph(dg, 7);
        System.out.println(sc.minCycle());


    }
}
