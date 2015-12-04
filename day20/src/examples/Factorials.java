package examples;

import java.util.function.IntFunction;
import java.util.stream.LongStream;

/**
 * To show the difference between recursive, iterative, and lambda/streams versions
 */
public class Factorials {
    private static final int LIMIT = 100;

    public static void main(String[] args) {
        System.out.println(timer(25, Factorials::factorialRecursive));
        System.out.println(timer(25, Factorials::factorialIterative));
        System.out.println(timer(25, Factorials::factorial));
    }

    public static long factorialRecursive(int n) {
        if (n > LIMIT) throw new IllegalArgumentException(n + " is out of range");
        return (1 > n) ? 1 : n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        if (n > LIMIT) throw new IllegalArgumentException(n + " is out of range");
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static long factorial(int n) {
        if (n > LIMIT) throw new IllegalArgumentException(n + " is out of range");
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

    private static long timer(int i, IntFunction<Long> aMethod) {
        long startTime = System.currentTimeMillis();
        long res = aMethod.apply(i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime);
        return res;
    }
}
