package q4_a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cp {

    public static void main(String[] args) {
        Cp c = new Cp();
        if (args.length == 2)
            c.launch(args[0], args[1]);
        else
            System.out.println("Usage: java Cp src dest");
    }

    public void launch(String fromFile, String toFile) {
        File aFile = new File(fromFile);
        File bFile = new File(toFile);

        if (bFile.exists()) {
            System.out.print("Do you want to overwrite " + bFile + "? y/n ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("n")) {
                System.out.println("File not copied");
            }
        } else {  // experiment with try-with-resources
            try (PrintWriter out = new PrintWriter(bFile);
                 BufferedReader in = new BufferedReader(new FileReader(aFile));) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("File " + aFile + " does not exist");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}