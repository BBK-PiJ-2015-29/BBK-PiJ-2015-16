package dowhile;

public class DoWhile {
    private final static int END_OF_INPUT = -1;
    private final static int MAX = 100;
    private final static int DIST = 70;
    private final static int PASS = 50;
    private final static int MIN = 0;

    public static void main(String[] args) {
        String str;
        int mark;
        int students = 0;
        int distinctions = 0;
        int passes = 0;
        int fails = 0;
        int invalid = -1;

        do {
            System.out.print("Input a mark: ");
            str = System.console().readLine();
            mark = Integer.parseInt(str);

            if (mark < 0 || mark > 100) {
                invalid++;
            } else {
                students++;
                if (mark >= DIST && mark <= MAX) {
                    distinctions++;
                }
                if (mark >= PASS && mark < DIST) {
                    passes++;
                }
                if (mark >= MIN && mark < PASS) {
                    fails++;
                }
            }

        } while (mark != END_OF_INPUT);
        System.out.println("There are " + students + " students: " + distinctions +
                " distinctions, " + passes + " passes, " + fails + " fails (plus " +
                invalid + " invalid)");
    }
}