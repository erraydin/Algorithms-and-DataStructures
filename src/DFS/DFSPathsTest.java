package DFS;

import Graph.Graph;

public class DFSPathsTest {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3,4);
        DFSPaths paths = new DFSPaths(graph, 0);
        System.out.println(paths.hasPathTo(2));
        for (int vertex : paths.pathTo(2)) {
            System.out.println(vertex);
        }

    }
}
