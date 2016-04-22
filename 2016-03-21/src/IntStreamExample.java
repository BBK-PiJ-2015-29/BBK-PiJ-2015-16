import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        IntStream.range(0, 10).forEach(
                nbr -> System.out.print(nbr + " ")
        );
        System.out.println();

        IntStream.range(0, 10).parallel().forEach(
                nbr -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    System.out.print(nbr + " ");
                }
        );
        System.out.println();
    }
}
