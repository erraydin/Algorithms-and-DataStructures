package Digraph;

public class DigraphTest {
    public static void main(String[] args) {
        Digraph dg = new Digraph(5);
        dg.addEdge(0, 1);
        dg.addEdge(1, 2);
        dg.addEdge(1, 3);
        dg.addEdge(1, 4);
        dg.addEdge(2, 4);
        dg.addEdge(2, 3);

        System.out.println(dg);
    }
}
