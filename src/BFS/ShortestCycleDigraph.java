package BFS;

import Digraph.Digraph;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;

//shortest cycle containing vertex
public class ShortestCycleDigraph {
    int length;
    int[] levels;
    public ShortestCycleDigraph(Digraph graph, int v){
        length = Integer.MAX_VALUE;
        levels = new int[graph.V()];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        levels[v] = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int nbr : graph.adj(cur)) {
                if (levels[nbr] == 1) {
                    length = levels[cur];
                    break;
                } else if (levels[nbr] == 0) {
                    queue.add(nbr);
                    levels[nbr] = levels[cur] + 1;
                }
            }
        }

    }

    public int minCycle() {
        if(length == Integer.MAX_VALUE) return -1;
        else return length;
    }
}
