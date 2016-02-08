package cat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import static java.lang.System.exit;

public class Cat {

    public static void main(String[] args) {
        Cat c = new Cat();
        for (int i = 0; i < args.length; i++) {
            c.launch(args[i]);
        }
    }

    public void launch(String name) {
        File file = new File(name);
        if (!file.exists()) {
            System.err.println("Oh dear it has all gone wrong");
            exit(-1);
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}