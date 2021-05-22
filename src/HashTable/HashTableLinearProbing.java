package HashTable;

public class HashTableLinearProbing<Key, Value> {
    private int M = 30001;
    private Key[] keys = (Key[]) new Object[M];
    private Value[] values = (Value[]) new Object[M];

    public Value get(Key key) {
        int index = hash(key);
        for (int i = index; keys[i] != null; i = (i+1) % M) {
            if (key.equals(keys[i])) return values[i];
        }
        return null;
    }

    public void put(Key key, Value val) {
        int i;
        for (i = hash(key); keys[i] != null; i = (i+1) % M) {
            if (key.equals(keys[i])) break;
        }

        keys[i] = key;
        values[i] = val;

    }





    private int hash(Key key) {
        //Making hashcode positive so that module gives a valid index
        return (key.hashCode() & 0x7fffffff) % M;
    }

}
