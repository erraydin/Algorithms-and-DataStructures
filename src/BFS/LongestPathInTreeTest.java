package BFS;

import Graph.Graph;

public class LongestPathInTreeTest {
    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 5);
        graph.addEdge(5, 6);
        graph.addEdge(7, 2);

        System.out.println(LongestPathInTree.longestPath(graph));
        System.out.println(LongestPathInTree.center(graph));
    }
}
