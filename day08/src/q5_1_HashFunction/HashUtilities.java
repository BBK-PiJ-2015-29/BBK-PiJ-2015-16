package q5_1_HashFunction;

public class HashUtilities {

    public static int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}