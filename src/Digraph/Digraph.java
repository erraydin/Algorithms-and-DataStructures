package Digraph;

import java.util.ArrayList;
import java.util.List;

public class Digraph {
    private final List<Integer>[] adj;
    private int V;
    private int E;

    public Digraph(int V) {
        adj = (ArrayList<Integer>[]) new ArrayList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>();
        }
        this.V = V;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        E++;
    }

    public List<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {return V;}
    public int E() {return E;}

    public Digraph reverse() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v < V; v++) {
            for (int w : adj[v]) {
                sb.append(v + "->" + w + "\n");
            }
        }
        return sb.toString();
    }
}
