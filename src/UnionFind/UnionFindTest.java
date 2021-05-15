package UnionFind;

public class UnionFindTest {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);
        uf.union(0, 1);
        uf.union(0,2);
        System.out.println(uf.connected(1, 2));
        uf.union(8, 9);
        System.out.println(uf.connected(8, 9));
        System.out.println(uf.connected(0, 9));
        uf.union(2, 9);
        System.out.println(uf.connected(0, 9));
    }
}
