package q12;

public class HashUtilities {

    public int shortHash(int input) {
        return Math.abs(input % 1000);
    }

}