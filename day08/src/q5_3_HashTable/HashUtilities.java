package q5_3_HashTable;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

    public static int veryShortHash(int input) {
        return Math.abs(input % 10);
    }


}