import java.util.Scanner;

public class Match {
    // returns number of indices where a and b
    // have same character in same position
    public static int similarity(String a, String b) {
        // shortest String determines loop condition
        int N = Math.min(a.length(), b.length());
        int matches = 0;
        for (int i = 0; i < N; i++) {
            if (a.charAt(i) == b.charAt(i)) matches++;
        }
        return matches;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = args[0];
        //  number of matched characters can’t be lower than zero
        int best = -1;
        String bestMatch = "";
        // read strings from standard input
        // remember best match found so far and its similarity number
        while (sc.hasNext()) {
            String b = sc.nextLine();
            int sim = similarity(a, b);
            if (sim > best) {
                best = sim;
                bestMatch = b;
            }
        }
        // output best match and its similarity
        System.out.print(bestMatch);
        System.out.print(" ");
        System.out.println(best);
    }
}