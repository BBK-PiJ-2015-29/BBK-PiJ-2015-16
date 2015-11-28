package q5_2_SimpleMap;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}