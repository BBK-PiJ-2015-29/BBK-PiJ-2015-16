package q6_1;

public class SimpleMapImpl<T, U> implements SimpleMap<T,U> {
    private static final int MAX = 1000;

    private KeyValuePair[] mapArray;

    public SimpleMapImpl() {
        mapArray = new KeyValuePair[MAX];
        for (int i = 0; i < MAX; i++) {
            mapArray[i] = null;
        }
    }

    @Override
    public void put(T key, U value) {
        KeyValuePair putPair = new KeyValuePairImpl(key, value);
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] == null) {
            mapArray[arrayPosition] = putPair;
            System.out.println("Added " + value + " to key > " + key + " <");
        } else {
            System.out.println("!!! > " + key + " < Key already in map");
        }
    }

    @Override
    public U get(T key) {
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] != null) {
            KeyValuePair kvPair = mapArray[arrayPosition];
            U result = (U) kvPair.getValue();
            return result;
        } else {
            System.out.print("Key not present ---> ");
            return null;
        }
    }

    @Override
    public boolean remove(T key) {
        int arrayPosition = getArrayPosition(key);
        if (mapArray[arrayPosition] != null) {
            mapArray[arrayPosition] = null;
            return true;
        }
        return false;
    }

    private int getArrayPosition(T key) {
        int hash = key.hashCode();
        return Math.abs(hash % MAX);
    }
}
