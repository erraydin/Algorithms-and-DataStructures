package BFS;

import Graph.Graph;
import QueueArray.Queue;

public class IsBipartiteBfs {
    public static boolean isBipartite(Graph graph) {
        boolean[] visited = new boolean[graph.V()];
        int[] color = new int[graph.V()];

        for(int v = 0; v < graph.V(); v++) {
            if (!visited[v]) {
                System.out.println(v);
                Queue<Integer> queue = new Queue<>();
                queue.enqueue(v);
                visited[v] = true;

                while (!queue.isEmpty()) {
                    int cur = queue.dequeue();
//                    System.out.println(cur);
                    for (int neighbor : graph.adj(cur)) {
                        if (!visited[neighbor]) {
                            queue.enqueue(neighbor);
                            color[neighbor] = 1 - color[cur];
                            visited[neighbor] = true;
                        } else if (color[neighbor] == color[cur]) {
                            return false;
                        }
                    }

                }
            }
        }

        return true;
    }
}
