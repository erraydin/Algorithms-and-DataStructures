package DFS;

import Graph.Graph;

public class TestDFSPaths {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3,4);
        Paths paths = new Paths(graph, 0);
        System.out.println(paths.hasPathTo(2));
        for (int vertex : paths.pathTo(2)) {
            System.out.println(vertex);
        }

    }
}
