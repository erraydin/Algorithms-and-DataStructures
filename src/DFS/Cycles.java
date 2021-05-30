package DFS;

import Graph.Graph;

public class Cycles {


    public static boolean hasCycles(Graph graph) {
        //visited[vertex] == 0 means it's not visited
        //                == 1 means is being visited
        //                == 2 means we finished visiting vertex and all the dfs calls from its children
        int[] visited = new int[graph.V()];
        boolean res = false;
        for (int v = 0; v < graph.V(); v++) {
            if (visited[v] == 0) {
                if(hasCyclesDfs(graph, -1, v, visited)) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }

    private static boolean hasCyclesDfs(Graph graph, int parent, int cur, int[] visited) {
        visited[cur] = 1;
        boolean res = false;
        for (int neighbor: graph.adj(cur)) {
            if (visited[neighbor] == 0) {
                if (hasCyclesDfs(graph, cur, neighbor, visited)) {
                    res = true;
                    break;
                }
            } else if(visited[neighbor] == 1 && neighbor != parent){
                    res = true;
                    break;
            }
        }
        visited[cur] = 2;
        return res;
    }



}
