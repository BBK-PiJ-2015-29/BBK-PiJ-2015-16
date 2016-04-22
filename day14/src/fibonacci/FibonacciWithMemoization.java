package fibonacci;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciWithMemoization {

    public static Map<Long, Long> fibMap = new ConcurrentHashMap<>();

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibMap.put(n, fibValue);
            return fibValue;
        }
    }

    public static void main(String args[]) {
        fibMap.put(0L, 1L);
        fibMap.put(1L, 1L);
        long preTime = System.currentTimeMillis();
        System.out.println("Value of 100th number in Fibonacci series->" + fibonacci(100));
        long postTime = System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));
    }
}

