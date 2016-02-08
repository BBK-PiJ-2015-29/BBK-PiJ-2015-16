package cpsingle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.exit;

public class Cp {

    public static void main(String[] args) {
        Cp c = new Cp();
        if (!(args.length == 2))
            System.out.println("Usage: java Cp src dest");

        File aFile = new File(args[0]);
        File bFile = new File(args[1]);

        if (!aFile.exists()) {
            System.out.println("File " + aFile + " does not exist");
            exit(-1);
        }

        if (bFile.exists()) {
            System.out.print("Do you want to overwrite " + bFile + "? y/n ");
            if (new Scanner(System.in).nextLine().equals("n")) {
                System.out.println("File not copied");
            }
        } else {
            try (PrintWriter out = new PrintWriter(bFile);
                 BufferedReader in = new BufferedReader(new FileReader(aFile));) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}