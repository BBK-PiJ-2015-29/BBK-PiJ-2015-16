package x3_hailstone_Numbers;

import java.util.ArrayList;
import java.util.List;

public class Hailstone {

    List<Integer> result;

    public static void main(String[] args) {
        Hailstone h = new Hailstone();
        h.launch();
    }

    public void launch() {
        result = new ArrayList<Integer>();
        hail(77);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public void hail(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
        result.add(n);
        if (n == 1) {
            return;
        } else {
            hail(n);
        }
        return;
    }

}




