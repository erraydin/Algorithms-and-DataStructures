package DFS;

import Graph.Graph;
import StackLinkedList.Stack;


public class Paths {
    private final boolean[] visited;
    private final int[] edgeTo;
    private final int source;

    public Paths(Graph graph, int source) {
        visited = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            visited[v] = false;
        }
        this.source = source;
        dfs(graph, source);
    }

    private void dfs(Graph graph, int vertex) {
        visited[vertex] = true;
        for (int neighbor : graph.adj(vertex)) {
            if (!visited[neighbor]) {
                edgeTo[neighbor] = vertex;
                dfs(graph, neighbor);
            }
        }
    }

    private void iterativeDfs(Graph graph, int source) {
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = true;

        while(!stack.isEmpty()) {
            int cur = stack.pop();
            for (int neighbor: graph.adj(cur)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    edgeTo[neighbor] = cur;
                    stack.push(neighbor);
                }
            }
        }

    }

    public boolean hasPathTo(int v) {
        return visited[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int cur = v; cur != source; cur = edgeTo[cur]){
            path.push(cur);
        }

        path.push(source);
        return path;
    }
}
