import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeStream {
    public static void main(String[] args) {
        Set<Integer> range = IntStream.range(1, 10).boxed()
                .collect(Collectors.toSet());
        System.out.println(range);

        Set<Integer> range2 = IntStream.rangeClosed(1, 10).boxed()
                .collect(Collectors.toSet());
        System.out.println(range2);
    }
}
