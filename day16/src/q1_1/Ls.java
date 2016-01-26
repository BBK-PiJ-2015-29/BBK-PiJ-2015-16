package q1_1;

import java.io.File;

public class Ls {
    public static void main(String[] args) {
        File dir = new File(".");
        String[] outputArray = dir.list();
        for (int i = 0; i < outputArray.length; i++) {
            System.out.println(">> " + outputArray[i]);
        }
    }
}