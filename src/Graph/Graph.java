package Graph;

import java.util.ArrayList;
import java.util.List;


public class Graph {
    private final int V;
    private int E;
    private final List<Integer>[] adj;

    public Graph(int V) {
        this.E = 0;
        this.V = V;
        adj = (ArrayList<Integer>[]) new ArrayList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<>();
        }
    }


    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {return V;}

    public int E() {return E;}

    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int v = 0; v< V; v++){
            for (int w : adj[v]) {
                res.append(v).append("-").append(w).append("\n");
            }
        }
        return res.toString();
    }
}
