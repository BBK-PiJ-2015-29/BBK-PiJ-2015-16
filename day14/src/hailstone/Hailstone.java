package hailstone;

import java.util.ArrayList;
import java.util.List;

public class Hailstone {
    List<Integer> result = new ArrayList<>();

    public void hail(int n) {
        int temp;
        if (n % 2 == 0) {
            temp = n / 2;
        } else {
            temp = 3 * n + 1;
        }
        result.add(temp);
        if (temp == 1) return;
        hail(temp);
    }
}

class Test {
    public static void main(String[] args) {
        Hailstone h = new Hailstone();
        h.hail(3);

        for (Integer i : h.result)
            System.out.print(i + " ");
        System.out.println();

    }

}