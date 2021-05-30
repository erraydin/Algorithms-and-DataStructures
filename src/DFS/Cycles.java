package DFS;

import Graph.Graph;

public class Cycles {


    /*#################################################################################################
    * ##########################  CHECK IF CYCLIC   ###################################################
    * ################################################################################################*/

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
    /*---------------------------------------><---------------------------------------------------*/



    /*#################################################################################################
     * ##################################  CHECK IF BIPARTITE   #########################################
     * ################################################################################################*/
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
