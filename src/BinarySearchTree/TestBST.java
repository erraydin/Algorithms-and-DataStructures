package BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer, Integer> bst = new BST<>();

        bst.put(5, 5);
        bst.put(3, 3);
        bst.put(7, 7);
        bst.put(2, 2);
        bst.put(6, 6);
        bst.put(9, 9);
        bst.put(8, 8);

        System.out.println(bst.get(7));
    }
}
