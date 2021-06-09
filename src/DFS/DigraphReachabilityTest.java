package DFS;

import Digraph.Digraph;

public class DigraphReachabilityTest {
    public static void main(String[] args) {
        Digraph dg = new Digraph(5);
        dg.addEdge(0, 1);
        dg.addEdge(1, 2);
        dg.addEdge(1, 4);
        dg.addEdge(2, 4);

        System.out.println(dg);
        DigraphReachability dgr = new DigraphReachability(dg, 0);
        System.out.println(dgr.pathTo(3));
    }
}
