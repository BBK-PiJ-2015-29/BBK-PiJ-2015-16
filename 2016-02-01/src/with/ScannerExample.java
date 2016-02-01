package with;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int number = 0;
        boolean isValidInput = false;
        Scanner kbd = null;
        try {
            kbd = new Scanner(System.in);
            while (!isValidInput) {
                try {
                    System.out.print("Enter an integer: ");
                    number = kbd.nextInt();
                    // If nextInt() throws an exception, we won't get here
                    isValidInput = true;
                    System.out.println("Received: " + number);
                } catch (InputMismatchException e) {
                    // This nextLine() consumes the token that
                    // nextInt() couldn't translate to an int.
                    String input = kbd.nextLine();
                    System.out.println(input + " is not an integer.");
                    System.out.println("Try again.");
                }
            }
        } finally {
            kbd.close();
        }
    }
}

