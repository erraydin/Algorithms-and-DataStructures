package DFS;

import Graph.Graph;

public class ConnectedComponentsTest {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);

        graph.addEdge(3, 4);

        graph.addEdge(5, 6);

        ConnectedComponents cc = new ConnectedComponents(graph);
        System.out.println(cc.count());
        System.out.println(cc.connected(1, 2));
        System.out.println(cc.connected(3, 4));
        System.out.println(cc.connected(1, 4));


    }
}
