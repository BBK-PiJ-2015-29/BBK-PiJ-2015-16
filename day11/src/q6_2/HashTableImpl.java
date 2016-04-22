package q6_2;

public class HashTableImpl<T, U> implements HashTable<T, U> {
    private final static int MAX = 1000;

    private LinkedKeyValuePair[] mapArray;

    public HashTableImpl() {
        mapArray = new LinkedKeyValuePair[1000];
        for (int i = 0; i < MAX; i++) {
            mapArray[i] = null;
        }
    }

    @Override
    public void put(T key, U value) {
        LinkedKeyValuePair putPair = new LinkedKeyValuePairImpl(key, value);
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] == null) {
            mapArray[arrayPosition] = putPair;
            System.out.println("Added " + value + " to key > " + key + " <");
        } else {
            LinkedKeyValuePair mapKeyPair = mapArray[arrayPosition];
            while (true) {
                if (mapKeyPair.getNext() == null) {
                    mapKeyPair.setNext(putPair);
                    System.out.println("Added " + value + " to key > " + key + " <");
                    return;
                } else {
                    mapKeyPair = mapKeyPair.getNext();
                }
            }
        }
    }

    // returns value on basis of stack (LIFO) within each key value of table
    // values not removed, but could do easy.
    @Override
    public U get(T key) {
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] != null) {

            LinkedKeyValuePair kvPair = mapArray[arrayPosition];
            while (true) {
                if (kvPair.getNext() == null) {
                    U result = (U) kvPair.getValue();
                    return result;
                } else {
                    kvPair = kvPair.getNext();
                }
            }
        } else {
            System.out.print("Key not present ---> ");
            return null;
        }
    }

    //removes all values under that key
    @Override
    public boolean remove(T key) {
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] != null) {
            mapArray[arrayPosition] = null;
            return true;
        } else {
            return false;
        }
    }

    private int getArrayPosition(T key) {
        int hash = key.hashCode();
        int shortHash = Math.abs(hash % 1000);
        return shortHash;
    }
}
