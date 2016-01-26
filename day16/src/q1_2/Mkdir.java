package q1_2;

import java.io.File;

public class Mkdir {

    public static void main(String[] args) {
        if (args.length == 1) {
            File f = new File(args[0]);
            f.mkdir();
        } else {
            System.out.println("Invlaid number of arguments: java Mkdir name");
        }
    }
}