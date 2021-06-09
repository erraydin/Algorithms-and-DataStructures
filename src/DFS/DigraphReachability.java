package DFS;

import Digraph.Digraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DigraphReachability {
    private final boolean[] visited;
    private final int[] edgeTo;
    private final int source;

    public DigraphReachability(Digraph graph, int source) {
        visited = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.source = source;
        dfs(graph, source);
    }

    private void dfs(Digraph graph, int vertex) {
        visited[vertex] = true;
        for (int nbr : graph.adj(vertex)) {
            if (!visited[nbr]) {
                edgeTo[nbr] = vertex;
                dfs(graph, nbr);
            }
        }
    }

    public boolean reachable(int w) {
        return visited[w];
    }

    public Stack<Integer> pathTo(int w) {
        if (!reachable(w)) return null;
        Stack<Integer> res = new Stack<>();
        for (int v = w; v != source; v = edgeTo[v]) {
            res.push(v);
        }
        res.push(source);
        return res;
    }
}
