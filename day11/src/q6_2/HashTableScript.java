package q6_2;

public class HashTableScript {

    public static void main(String[] args) {
        {
            HashTable<Integer, String> ht = new HashTableImpl<Integer, String>();
            System.out.println();
            System.out.println(" === NEW MAP: INTEGER FOR KEY AND STRING FOR VALUES=== ");
            System.out.println(" === TEST PUT & GET === ");
            System.out.println("Get key 99 ---> " + ht.get(99));
            ht.put(10, "Mum");
            System.out.println("Get key 10 ---> " + ht.get(10));
            ht.put(10, "Tom");
            ht.put(10, "Ellie");
            System.out.println("Get key 10 ---> " + ht.get(10));
            ht.put(10, "Anna");
            System.out.println("Remove 10: " + ht.remove(10));
            System.out.println("Get key 10 ---> " + ht.get(10));
            System.out.println("Remove 10: " + ht.remove(10));
            System.out.println();
        }
        {
            HashTable<String, Double> ht = new HashTableImpl<String, Double>();
            System.out.println();
            System.out.println(" === NEW MAP: STRING FOR KEY AND DOUBLE FOR VALUE === ");
            System.out.println(" === TEST PUT & GET === ");
            System.out.println("Get key aaa ---> " + ht.get("aaa"));
            ht.put("bbb", 1.1);
            System.out.println("Get key bbb ---> " + ht.get("bbb"));
            ht.put("bbb", 2.2);
            ht.put("bbb", 3.3);
            System.out.println("Get key bbb ---> " + ht.get("bbb"));
            ht.put("bbb", 4.4);
            System.out.println("Remove bbb: " + ht.remove("bbb"));
            System.out.println("Get key bbb ---> " + ht.get("bbb"));
            System.out.println("Remove bbb: " + ht.remove("bbb"));
            System.out.println();
        }
    }
}