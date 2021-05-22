package HashTable;

public class HashTableSeparateChaining<Key, Value> {
    private int M = 97;  //number of chains
    private Node[] hashTable = new Node[M];


    //You make this static and key val object because there is no generic array creation in Java
    private static class Node {
        private Object val;
        private Object key;
        private Node next;

        public Node(Object key, Object val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        int index = hash(key);
        for (Node node = hashTable[index]; node != null; node = node.next) {
            if (key.equals(node.key)) return (Value) node.val;
        }
        return null;
    }

    public void put(Key key, Value val) {
        int index = hash(key);
        for (Node node = hashTable[index]; node != null; node = node.next) {
            if (key.equals(node.key)) {node.val = val; return;}
        }
        hashTable[index] = new Node(key, val, hashTable[index]);
    }

    private int hash(Key key) {
        //Making hashcode positive so that module gives a valid index
        return (key.hashCode() & 0x7fffffff) % M;
    }
}
