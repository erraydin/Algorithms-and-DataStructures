package DFS;

import Digraph.Digraph;

import java.util.Arrays;

public class DigraphCyclesTest {
    public static void main(String[] args) {
    Digraph dg = new Digraph(6);
    dg.addEdge(0, 1);
    dg.addEdge(2, 3);
    dg.addEdge(3, 5);
    dg.addEdge(5, 2);
    DigraphCycles dgc = new DigraphCycles(dg);
    System.out.println(Arrays.toString(dgc.edgeTo()));
    System.out.println(dgc.getCycleRoot());
    System.out.println(dgc.cycle());


    }


}
