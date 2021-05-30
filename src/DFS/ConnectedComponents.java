package DFS;

import Graph.Graph;

//Preprocess Graph to answer the question is v and w connected? in constant time
//More efficient than union find, but not dynamic like union find.
public class ConnectedComponents {
    private final int[] id;
    private final boolean[] visited;
    private int count;

    public ConnectedComponents(Graph graph) {
        count = 0;
        id = new int[graph.V()];
        visited = new boolean[graph.V()];

        for(int v = 0; v < graph.V(); v++) {
            if (!visited[v]) {
                count++;
                dfs(graph, v);
            }
        }
    }

    private void dfs(Graph graph, int vertex) {
        visited[vertex] = true;
        id[vertex] = count;
        for (int neighbor: graph.adj(vertex)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor);
            }
        }
    }

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }
    public int count() {return count;}
    public int id(int v) {return id[v];}
}
