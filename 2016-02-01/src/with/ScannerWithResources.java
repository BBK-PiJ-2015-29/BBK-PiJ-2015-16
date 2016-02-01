package with;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerWithResources {
    public static void main(String[] args) {
        int number = 0;
        boolean isValidInput = false;

        try (Scanner kbd = new Scanner(System.in)) {
            while (!isValidInput) {
                System.out.print("Enter an integer: ");
                if (kbd.hasNextInt()) {
                    number = kbd.nextInt();
                    // If nextInt() throws an exception, we won't get here
                    System.out.println("Received: " + number);
                    isValidInput = true;
                } else {
                    System.out.println(kbd.next() + " is not an integer.");
                    System.out.println("Try again.");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Something really went wrong!");
        }
    }
}
