import java.util.ArrayList;
import java.util.Iterator;

public class ListGenerics {
    public static void printListOfStrings(ArrayList<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void printListOfStringsAgain(ArrayList<?> list) {
        Iterator<?> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
