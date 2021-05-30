package DFS;

import Graph.Graph;

public class IsBipartite {
    public static boolean isBipartite(Graph graph) {
        boolean[] visited = new boolean[graph.V()];

        // colors are 0 and 1
        int[] color = new int[graph.V()];
        boolean res = true;
        for (int v = 0; v < graph.V(); v++){
            if (!visited[v]) {
                if(!dfsIsBipartite(graph, -1, v, visited, color)) {
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    private static boolean dfsIsBipartite(Graph graph, int parent, int cur, boolean[] visited, int[] color) {
        visited[cur] = true;
        if (parent == -1) color[cur] = 0;
        else color[cur] = 1 - color[parent];
        boolean res = true;
        for (int neighbor : graph.adj(cur)) {
            if (!visited[neighbor]) {
                if (!dfsIsBipartite(graph, cur, neighbor, visited, color)) {
                    res = false;
                    break;
                }
            } else if (visited[neighbor] && color[neighbor] == color[cur]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
