package DFS;

import Digraph.Digraph;

import java.util.Stack;

public class DigraphCycles {
    // 0 means not visited
    // -1 means started visiting it
    // 1 means we are done with it and everything comes after completely
    private final int[] visited;
    private boolean hasCycle;
    private int cycleRoot;
    private final int[] edgeTo;

    public DigraphCycles(Digraph graph) {
        visited = new int[graph.V()];
        edgeTo = new int[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            if (visited[v] == 0) {
                dfs(graph, v);
            }
        }
    }

    private void dfs(Digraph graph, int v) {
        visited[v] = -1;
        for (int nbr : graph.adj(v)) {
            if (visited[nbr] == -1) {
                hasCycle = true;
                edgeTo[nbr] = v;
                cycleRoot = nbr;
                break;
            } else if (visited[nbr] == 0) {
                edgeTo[nbr] = v;
                dfs(graph, nbr);
            }
        }
        visited[v] = 1;
    }
    public int[] edgeTo() {
        return edgeTo;
    }

    public int getCycleRoot() {
        return cycleRoot;
    }
    public Stack<Integer> cycle() {
        if (!hasCycle) return null;
        Stack<Integer> res = new Stack<>();
        int prev = cycleRoot;
        for (int v = edgeTo[prev]; v != cycleRoot; v = edgeTo[v]) {
            res.push(v);
            prev = v;
        }
        res.push(cycleRoot);
        return res;

    }

    public boolean hasCycle() {return hasCycle;}
}
