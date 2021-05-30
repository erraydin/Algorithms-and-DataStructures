package BFS;

import DFS.IsBipartite;
import Graph.Graph;

public class IsBipartiteBfsTest {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);

        System.out.println(IsBipartiteBfs.isBipartite(graph)) ;
    }
}
