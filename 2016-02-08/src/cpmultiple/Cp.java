package cpmultiple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cp {
    private File[] fileList;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("java Cp src ... destDir");
            System.exit(-1);
        }
        int number = countFiles(args);
        processFiles(number, args);

    }

    private static int countFiles(String[] args) {
        int fileCount = 0;
        for (int i = 0; i < args.length - 1; i++) {
            File file = new File(args[i]);
            if (file.exists()) {
                fileCount++;
            } else {
                System.out.println("File " + file + " does not exist");
                System.exit(-1);
            }
        }
        return fileCount;
    }

    private static void processFiles(int fileCount, String[] args) {
        Scanner sc = new Scanner(System.in);
        File[] fileList = new File[fileCount];
        for (int i = 0; i < args.length - 1; i++) {
            File file = new File(args[i]);
            if (file.exists()) {
                fileList[i] = file;
            }
        }
        File dir = new File(args[args.length - 1]);
        if (!dir.isDirectory()) {
            System.out.println("> " + dir + " is not a directory");
            return;
        }
        for (int i = 0; i < fileList.length; i++) {
            String str = dir + "/" + fileList[i];
            File newFile = new File(str);
            copy(sc, fileList[i], newFile);
        }
    }

    public static void copy(Scanner sc, File aFile, File bFile) {
        if (bFile.exists()) {
            System.out.print("Do you want to overwrite " + bFile + "? y/n");
            String str = sc.nextLine();
            if (str.equals("n")) {
                System.out.println("File not copied");
                return;
            }
        }
        try (PrintWriter output = new PrintWriter(bFile);
             BufferedReader input = new BufferedReader(new FileReader(aFile));) {
            String line;
            while ((line = input.readLine()) != null) {
                output.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}