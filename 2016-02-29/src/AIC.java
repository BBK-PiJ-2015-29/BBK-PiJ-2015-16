import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AIC {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 12, 3, 4, 5);

        System.out.println(al);

//        Comparator<Integer> mycomp = new MyComparator<>();

//        al.sort(mycomp);
        al.sort(new AIC().new MyComparator<>());
        System.out.println(al);
    }

    private class MyComparator<T extends Integer> implements Comparator<T> {

        @Override
        public int compare(T o1, T o2) {
            return o1.compareTo(o2);
        }
    }
}


