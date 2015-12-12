package q5.simpleMap;

public class SimpleMapImpl implements SimpleMap {

    private String[] mapArray;

    public SimpleMapImpl() {
        mapArray = new String[1000];
    }

    public void put(int key, String name) {
        if (mapArray[key] == null) {
            mapArray[key] = name;
            System.out.println("Added " + name + " to key >" + key + "<");
        } else {
            System.out.println(">" + key + "< Key already in map");
        }
    }

    public String get(int key) {
        return mapArray[key];
    }

    public void remove(int key) {
        System.out.println("Removing >" + key + "<");
        mapArray[key] = null;
    }

    public boolean isEmpty() {

        for (int i = 0; i < 1000; i++) {
            if (mapArray[i] != null) {
                return false;
            }
        }
        return true;
    }

}