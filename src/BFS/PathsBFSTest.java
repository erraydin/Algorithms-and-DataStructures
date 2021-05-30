package BFS;

import Graph.Graph;

import java.util.Arrays;

public class PathsBFSTest {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);

        PathsBFS paths = new PathsBFS(graph, 0);
        for (int vertex : paths.minPathTo(2)) {
            System.out.println(vertex);
        }

        System.out.println(paths.hasPathTo(4));
    }
}
