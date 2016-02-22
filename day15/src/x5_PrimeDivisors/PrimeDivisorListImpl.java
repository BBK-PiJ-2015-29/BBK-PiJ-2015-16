package x5_PrimeDivisors;

import java.util.LinkedList;
import java.util.List;

public class PrimeDivisorListImpl implements PrimeDivisorList {

    private List<Integer> list = new LinkedList<>();

    @Override
    public void add(Integer i) throws NullPointerException, IllegalArgumentException {
        if (i == null) {
            throw new NullPointerException("No Null in this list");
        }
        if (!isPrime(i)) {
            throw new IllegalArgumentException("No non-primes in this list");
        }
        list.add(i);
    }

    @Override
    public Integer remove() {
        return list.remove(0);
    }

    @Override
    public String toString() {
        int total = 0;
        Integer a = remove();
        Integer b = remove();
        if (a == null) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder("[ " + a);
        total = a;
        while (b != null) {
            if (b != a) {
                result.append(" * " + b);
                total = total * b;
            }

            int count = 1;
            while (b == a) {
                count++;
                total = total * b;
                a = b;
                b = remove();
            }
            if (count > 1) {
                result.append("^" + count);
            } else {
                a = b;
                b = remove();
            }
        }
        return result.append(" = ").append(total).append(" ]").toString();
    }

    private boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
