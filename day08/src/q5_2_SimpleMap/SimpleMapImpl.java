package q5_2_SimpleMap;

public class SimpleMapImpl implements SimpleMap {
    private static final int SIZE = 1000;

    private String[] mapArray;

    public SimpleMapImpl() {
        mapArray = new String[SIZE];
    }

    @Override
    public void put(int key, String name) {
        if (mapArray[key] == null) {
            mapArray[key] = name;
            System.out.println("Added " + name + " to key >" + key + "<");
        } else {
            System.out.println(">" + key + "< Key already in map");
        }
    }

    @Override
    public String get(int key) {
        return mapArray[key];
    }

    @Override
    public void remove(int key) {
        System.out.println("Removing >" + key + "<");
        mapArray[key] = null;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < 1000; i++) {
            if (mapArray[i] != null) {
                return false;
            }
        }
        return true;
    }
}