package TopologicalSort;

import Digraph.Digraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSortBFS {
    int[] inDegrees;
    Stack<Integer> res;

    public TopologicalSortBFS(Digraph graph) {
        inDegrees = countInDegrees(graph);
        res = new Stack<>();

        Queue<Integer> queue= new LinkedList<>();
        for (int v = 0; v < graph.V(); v++) {
            if (inDegrees[v] == 0) {
                queue.add(v);
            }
        }

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            res.push(vertex);
            for (int nbr : graph.adj(vertex)) {
                if(--inDegrees[nbr] == 0) {
                    queue.add(nbr);
                }
            }
        }
    }

    public Stack<Integer> topSort() {
        return res;
    }

    private int[] countInDegrees(Digraph graph) {
        int[] res = new int[graph.V()];
        for (int v = 0; v < graph.V(); v++) {
            for (int nbr : graph.adj(v)) {
                res[nbr]++;
            }
        }
        return res;
    }
}
