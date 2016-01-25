package memo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Doubler {
    private static Map<Integer, Integer> memo = new ConcurrentHashMap<>();

    public static Integer doubleValue(Integer x) {
        if (memo.containsKey(x)) {
            System.out.println("using memo");
            return memo.get(x);
        } else {
            int res = x * 2;
            memo.put(x, res);
            System.out.println(memo);
            return res;
        }
    }
}

class TesTDoubler {
    public static void main(String[] args) {

        System.out.println(Doubler.doubleValue(6));
        System.out.println(Doubler.doubleValue(16));
        System.out.println(Doubler.doubleValue(6));
        System.out.println(Doubler.doubleValue(16));
        System.out.println(Doubler.doubleValue(6));
        System.out.println(Doubler.doubleValue(16));

    }
}
