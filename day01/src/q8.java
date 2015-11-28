public class q8 {

    /*
        Write a program that read a (arbitrarily long) sequence of positive numbers.
        The sequence is ended when the users enters “-1”.
        At that point, the program must output the highest number in the sequence.
     */
    public static void main(String[] args) {

        int value;
        boolean values = false;
        int highest = -1;

        System.out.println("Enter a (arbitrarily long)  sequence of +ve numbers");
        System.out.println("Enter -1 to end the sequence");


        do {
            System.out.print("Please enter a number: ");
            String str = System.console().readLine();
            value = Integer.parseInt(str);

            if (value != -1) {
                values = true;
                if (value > highest) {
                    highest = value;
                }
            }

        }
        while (value != -1);

        if (values)
            System.out.println("The highest number in the sequence is " + highest);
        else
            System.out.println("You did not enter any valid values");

    }
}