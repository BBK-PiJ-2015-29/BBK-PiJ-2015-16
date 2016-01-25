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

class HailstoneTwo {
    //As always converges to one, cannot go to same point twice and so no advantage from memoization

    public static List<Integer> hailstone(int n) {
        List<Integer> list = new ArrayList<Integer>();

        return getHailstone(list, n);

    }

    private static List<Integer> getHailstone(List<Integer> list, int n) {
        list.add(n);

        if (n == 1) return list;

        if (n % 2 == 0) return getHailstone(list, n / 2);

        return getHailstone(list, 3 * n + 1);
    }

}



