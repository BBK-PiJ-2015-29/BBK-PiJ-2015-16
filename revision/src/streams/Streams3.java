package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Benjamin Winterberg
 */
public class Streams3 {

    public static final int MAX = 1000000;

    public static void sortSequential() {
        List<String> values = new ArrayList<>(MAX);
        IntStream.range(0, MAX).forEach(i -> {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        });

        // sequential

        final long start = System.nanoTime();

        System.out.println(values.stream().sorted().count());

        final long stop = System.nanoTime();

        System.out.println(String.format("sequential sort took: %d ms", TimeUnit.NANOSECONDS.toMillis(stop - start)));
    }

    public static void sortParallel() {
        List<String> values = new ArrayList<>(MAX);
        IntStream.range(0, MAX).forEach(i -> {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        });

        final long start = System.nanoTime();

        System.out.println(values.parallelStream().sorted().count());

        final long stop = System.nanoTime();

        System.out.println(String.format("parallel sort took: %d ms", TimeUnit.NANOSECONDS.toMillis(stop - start)));
    }

    public static void main(String[] args) {
        sortSequential();
        sortParallel();
    }
}
