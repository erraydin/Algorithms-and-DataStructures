package TopologicalSort;

import Digraph.Digraph;

public class TopologicalSortDFSTest {
    public static void main(String[] args) {
        Digraph dg = new Digraph(10);
        dg.addEdge(0, 1);
        dg.addEdge(0, 2);
        dg.addEdge(1, 3);
        dg.addEdge(2, 4);
        dg.addEdge(3, 5);
        dg.addEdge(4, 5);

        dg.addEdge(9, 8);
        dg.addEdge(9, 7);
        dg.addEdge(8, 6);
        dg.addEdge(7, 6);

        TopologicalSortsDFS ts = new TopologicalSortsDFS(dg);
        System.out.println(ts.reversePost());

    }
}
