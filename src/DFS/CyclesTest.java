package DFS;

import Graph.Graph;

public class CyclesTest {
    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(4, 6);

        System.out.println(Cycles.hasCycles(graph));
    }
}
