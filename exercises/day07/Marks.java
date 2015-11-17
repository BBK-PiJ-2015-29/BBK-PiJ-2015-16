public class Marks {

    public static void main(String[] args) {
        countMarks();
    }

    public static void countMarks() {
        System.out.println("Input some marks, finish with -1:");
        int mark;
        int counter = 0;
        int dist = 0;
        int pass = 0;
        int fail = 0;
        int invalid = 0;
        do {
            System.out.print("Input mark: ");
            mark = Integer.parseInt(System.console().readLine());
            counter++;
            if (mark >= 70 && mark <= 100) {
                dist++;
            } else if (mark >= 50 && mark <= 69) {
                pass++;
            } else if (mark >= 0 && mark <= 49) {
                fail++;
            } else {
                invalid++;
            }
        } while (mark != -1);
        System.out.println("Of " + counter + " marks, there were " + dist + " distinctions, " + pass + " passes and " + fail + " fails. (" + invalid + " invalid marks.)");
    }
}