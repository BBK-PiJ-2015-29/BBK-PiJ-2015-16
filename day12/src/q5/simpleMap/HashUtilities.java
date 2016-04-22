package q5.simpleMap;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}