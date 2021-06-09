package TopologicalSort;


import Digraph.Digraph;

import java.util.Stack;

//works on DAG
public class TopologicalSortsDFS {
    private final boolean[] visited;
    private final Stack<Integer> reversePost;

    public TopologicalSortsDFS(Digraph graph) {
        reversePost = new Stack<>();
        visited = new boolean[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            if (!visited[v]) {
                dfs(graph, v);
            }
        }
    }

    private void dfs(Digraph graph, int vertex) {
        visited[vertex] = true;
        for (int nbr : graph.adj(vertex)) {
            if (!visited[nbr]) {
                dfs(graph, nbr);
            }

        }
        reversePost.push(vertex);
    }

    public Stack<Integer> reversePost() {
        return reversePost;
    }
}
