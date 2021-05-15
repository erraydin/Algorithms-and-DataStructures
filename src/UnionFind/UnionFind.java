package UnionFind;


public class UnionFind {
    private int[] parent;

    //size[i] = size of the tree that has i has root. (if i is a root, else useless info)
    private int[] size;

    public UnionFind(int capacity) {
        parent = new int[capacity];
        size = new int[capacity];
        for (int i =0; i < capacity; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }


    public void union(int p, int q) {
        if (p >= parent.length || q >= parent.length) {
            throw new IllegalArgumentException();
        }

        int rootP = root(p);
        int rootQ = root(q);
        if (size[rootP] <= size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }

    public boolean connected(int p, int q){
        if (p >= parent.length || q >= parent.length) {
            throw new IllegalArgumentException();
        }
        int rootP = root(p);
        int rootQ = root(q);
        return rootP == rootQ;
    }

    //with path compression
    private int root(int p) {
        if (p >= parent.length ) {
            throw new IllegalArgumentException();
        }
        int cur = p;
        while (parent[cur] != cur) {
            cur = parent[cur];
        }
        while (parent[p] != cur) {
            parent[p] = cur;
        }
        return cur;
    }
}
