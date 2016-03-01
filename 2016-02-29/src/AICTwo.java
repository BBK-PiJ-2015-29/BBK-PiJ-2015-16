import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AICTwo<T extends Integer> {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 12, 3, 4, 5);

        new AICTwo().mymethod(al);
        System.out.println(al);

        al.sort((x, y) -> x.compareTo(y));

    }

    private List mymethod(List al) {

        al.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }

        });
        return al;
    }
}


