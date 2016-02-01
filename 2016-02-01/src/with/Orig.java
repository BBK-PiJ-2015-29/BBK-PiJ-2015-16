package with;

import java.util.Scanner;

public class Orig {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int number = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter an integer: ");
            number = kbd.nextInt();
            // If nextInt() throws an exception, we won't get here
            isValidInput = true;
        }
    }

}

