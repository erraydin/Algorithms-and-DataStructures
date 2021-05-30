package DFS;

import Graph.Graph;

public class Cycles {

    public static boolean hasCycles(Graph graph) {

        boolean[] visited = new boolean[graph.V()];
        boolean res = false;
        for (int v = 0; v < graph.V(); v++) {
            if (!visited[v]) {
                if(hasCyclesDfs(graph, -1, v, visited)) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }

    private static boolean hasCyclesDfs(Graph graph, int parent, int cur, boolean[] visited) {
        visited[cur] = true;
        for (int neighbor: graph.adj(cur)) {
            if (!visited[neighbor]) {
                if (hasCyclesDfs(graph, cur, neighbor, visited)) {
                    return true;
                }
            } else if(neighbor != parent){
                    return true;
            }

        }
        return false;
    }
}
