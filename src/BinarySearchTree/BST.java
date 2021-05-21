package BinarySearchTree;



import QueueArray.Queue;
import com.sun.source.tree.Tree;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
    private TreeNode root;

    private class TreeNode {
        private Key key;
        private Value val;
        private TreeNode left, right;
        //size of the subtree at that node
        private int count;

        public TreeNode(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    /*##########################################################################
    * #######################    CRUD and SIZE     ######################################
    * ############################################################################ */
    public int size() {
        return size(root);
    }

    private int size(TreeNode x) {
        if ( x == null) return 0;
        else return x.count;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private TreeNode put(TreeNode x, Key key, Value val) {
        if (x == null) return new TreeNode(key, val);

        int comparison = key.compareTo(x.key);

        if        (comparison < 0) {
            x.left = put(x.left, key, val);
        } else if (comparison > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.val = val;
        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    public Value get(Key key) {
        TreeNode cur = root;
        while (cur != null) {
            int comparison = key.compareTo(cur.key);

            if (comparison < 0) cur = cur.left;
            else if (comparison > 0) cur = cur.right;
            else return cur.val;
        }
        return null;
    }


    public void delete(Key key) {
        root = delete(root, key);
    }

    //Hibbard Deletion
    private TreeNode delete(TreeNode x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = delete(x.left, key);
        else if (cmp > 0) x.right = delete(x.right, key);
        else {
            if (x.right == null) return x.left;
            if (x.left == null) return x.right;

            //t will be the least element in the right subtree
            //remove it, and keep its value. Then replace x with that.
            TreeNode t = x;
            x = findMin(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;

        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }
    public TreeNode findMin(TreeNode x) {
        if (x == null) throw new NoSuchElementException();
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private TreeNode deleteMin(TreeNode x) {
        if (x.left == null) return x.right;

        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    /*------------------------------------><-----------------------------------------------*/

    /*##########################################################################
    * #######################    ORDERED OPERATIONS     #######################
   * ############################################################################ */

    //Number of keys less than the input
    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(TreeNode x, Key key) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);

        if (cmp > 0) return 1 + size(x.left) + rank(x.right, key);
        else if (cmp < 0) return rank(x.left, key);
        else return  size(x.left);
    }

    //Smallest key that is larger or equal to input
    public Key ceiling(Key key) {
        TreeNode x = ceiling(root, key);
        if ( x == null) return null;
        else return x.key;
    }

    private TreeNode ceiling(TreeNode x, Key key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);

        if (cmp == 0) return x;
        if (cmp > 0) return ceiling(x.right, key);

        TreeNode potential = ceiling(x.left, key);
        if (potential != null) return potential;
        else return x;
    }

    //largest key smaller than or equal to the input
    public Key floor(Key key) {
        TreeNode x = floor(root, key);
        if (x == null) return null;
        else return x.key;
    }

    private TreeNode floor(TreeNode x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);

        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key);

        TreeNode potential = floor(x.right, key);
        if (potential != null) return potential;
        else return x;
    }


    public Key maxKey() {
        if ( root == null ) throw new EmptyStackException();
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        return cur.key;
    }

    public Key minKey() {
        if ( root == null ) throw new EmptyStackException();
        TreeNode cur = root;
        while (cur.left != null) cur = cur.left;
        return cur.key;
    }

    /*-------------------------------------><----------------------------------------------------*/

    /*##########################################################################
     * #######################    ITERATION    #################################
     * ############################################################################ */

    //inorder traversal, so increasing order
    public Iterable<Key> keys() {
        Queue<Key> q = new Queue<>();
        inorder(root, q);
        return q;
    }

    private void inorder(TreeNode x, Queue<Key> q) {
        if (x == null) return;
        inorder(x.left, q);
        q.enqueue(x.key);
        inorder(x.right, q);
    }

    /*-------------------------------------><----------------------------------------------------*/
}
