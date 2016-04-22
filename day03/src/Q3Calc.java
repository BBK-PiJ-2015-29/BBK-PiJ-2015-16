public class Q3Calc {

    public static void main(String[] args) {
        int answer = 0;
        char find;

        String function = "";
        System.out.print("Maths expression: ");
        String input = System.console().readLine();

        // find the operator its place in the string
        int length = input.length();
        int i = 0;
        int place = 0;
        while (i < length) {
            find = input.charAt(i);
            if (find == '+') {
                function = "a";
                place = i;
            }
            if (find == '-') {
                function = "s";
                place = i;
            }
            if (find == '*') {
                function = "m";
                place = i;
            }
            if (find == '/') {
                function = "d";
                place = i;
            }
            i++;
        }

        // get the two numbers
        String numOne = input.substring(0, place);
        String numTwo = input.substring(place + 1, length);
        int p = Integer.parseInt(numOne);
        int q = Integer.parseInt(numTwo);

        // calculate
        if (function.equals("a")) {
            answer = p + q;
        } else if (function.equals("s")) {
            answer = p - q;
        } else if (function.equals("m")) {
            answer = p * q;
        } else if (function.equals("d")) {
            answer = p / q;
        }

        //output
        System.out.println("The answer is: " + answer);
    }
}

