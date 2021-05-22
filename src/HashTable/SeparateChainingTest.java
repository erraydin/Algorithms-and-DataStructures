package HashTable;

public class SeparateChainingTest {
    public static void main(String[] args) {
        HashTableSeparateChaining<String, Integer> ht = new HashTableSeparateChaining<>();
        ht.put("ali", 3);
        System.out.println("ali is " + ht.get("ali") + " years old");
        ht.put("veli", 12);
        System.out.println("veli is " + ht.get("veli") + " years old");
        ht.put("kamil", 15);
        System.out.println("kamil is " + ht.get("kamil") + " years old");
        ht.put("veli", 26);
        System.out.println("veli is " + ht.get("veli") + " years old");
        System.out.println("ali is " + ht.get("ali") + " years old");

    }
}
