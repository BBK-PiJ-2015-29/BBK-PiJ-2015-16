package newcat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.exit;

public class Cat {
    public static void main(String... args) {
        if (args.length != 1) {
            System.err.println("The number of arguments should be one file name");
            exit(-1);
        }

        File f = new File(args[0]);
        if (!f.exists()) {
            System.err.println("Sorry, the file with name [" + args[0] + "] does not exist!");
            exit(-1);
        }

        cat(f);
    }

    private static String cat(File f) {
        StringBuilder s = new StringBuilder("output: ");


        try (BufferedReader b = new BufferedReader(new FileReader(f))) {
            String str;
            while ((str = b.readLine()) != null) {
                s.append(str);
                s.append("\n");
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s.toString();
    }

    private void meth(Object... stuff) {  // just for show
    }
}
