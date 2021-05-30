package BFS;

import Graph.Graph;
import QueueArray.Queue;
import StackLinkedList.Stack;

public class PathsBFS {
    private final boolean[] visited;
    private final int[] edgeTo;
    private final int source;

    public PathsBFS(Graph graph, int source) {
        this.source = source;
        visited = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(source);
        visited[source] = true;

        while(!queue.isEmpty()) {

            int cur = queue.dequeue();

            for (int neighbor : graph.adj(cur)) {

                if (!visited[neighbor]) {
                    queue.enqueue(neighbor);
                    visited[neighbor] = true;
                    edgeTo[neighbor] = cur;
                }

            }
        }
    }

    public boolean hasPathTo(int v) {return visited[v];}

    public Iterable<Integer> minPathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int cur = v; cur != source; cur = edgeTo[cur]) {
            path.push(cur);
        }
        path.push(source);
        return path;
    }
}
