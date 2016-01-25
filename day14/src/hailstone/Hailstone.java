package hailstone;

import java.util.ArrayList;
import java.util.List;

public class Hailstone {

    List<Integer> result;

    public static void main(String[] args) {
        Hailstone h = new Hailstone();
        h.result = new ArrayList<>();
        h.hail(3);

        for (Integer i : h.result)
            System.out.println(i);
    }

    public void hail(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
        result.add(n);
        if (n == 1)
            return;
        hail(n);
        return;
    }

}




