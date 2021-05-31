package BFS;

import Graph.Graph;
import QueueArray.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LongestPathInTree {
    public static Iterable<Integer> longestPath(Graph graph) {

        //First BFS
        Queue<Integer> queue = new Queue<>();
        boolean[] visited = new boolean[graph.V()];
        queue.enqueue(0);
        visited[0] = true;
        int startLeaf = 0;
        while(!queue.isEmpty()) {
            int cur = queue.dequeue();
            for (int neighbor : graph.adj(cur)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.enqueue(neighbor);
                }
            }
            if (queue.isEmpty()) {
                startLeaf = cur;
            }
        }

        //Second BFS from startLeaf
        int[] edgeTo = new int[graph.V()];
        visited = new boolean[graph.V()];
        queue.enqueue(startLeaf);
        visited[startLeaf] = true;
        int endLeaf = 0;

        while (!queue.isEmpty()) {
            int cur = queue.dequeue();
            for (int neighbor : graph.adj(cur)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.enqueue(neighbor);
                    edgeTo[neighbor] = cur;
                }
            }

            if (queue.isEmpty()) {
                endLeaf = cur;
            }
        }

        Stack<Integer> path = new Stack<>();
        for (int node = endLeaf; node != startLeaf; node = edgeTo[node]) {
            path.push(node);
        }
        path.push(startLeaf);

        return path;


    }
}
