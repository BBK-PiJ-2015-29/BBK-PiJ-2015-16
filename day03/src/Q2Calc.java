public class Q2Calc {

    public static void main(String[] args) {
        double p = 0.0;
        double q = 0.0;
        double answer = 0.0;

        //get inputs
        System.out.println("Please provide two numbers");
        System.out.print("First number: ");
        String str1 = System.console().readLine();
        p = Double.parseDouble(str1);
        System.out.println("Entered: " + p);

        System.out.print("Second number: ");
        String str2 = System.console().readLine();
        q = Double.parseDouble(str2);
        System.out.println("Entered: " + q);

        System.out.print("What do you want to do?  a = add, s = subtract, m = multiply, d = divide: ");
        String str = System.console().readLine();
        System.out.println("Entered: " + str);

        // calculate
        if (str.equals("a")) {
            answer = p + q;
        }
        if (str.equals("s")) {
            answer = p - q;
        }
        if (str.equals("m")) {
            answer = p * q;
        }
        if (str.equals("d")) {
            answer = p / q;
        }

        //output
        System.out.println("The answer is: " + answer);
    }
}

