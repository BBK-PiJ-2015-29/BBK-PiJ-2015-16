package x1_memoizedFibonacci;

public class Fib {

    private int[] precalculated = null;

    public static void main(String[] args) {
        Fib f = new Fib();
        System.out.println("====");
        System.out.println("45 Without: " + f.fibWithout(45));
        System.out.println("45 With: " + f.fibWith(45));
    }

    public static int fibWithout(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibWithout(n - 1) + fibWithout(n - 2);
        }
    }

    private int fibWith(int n) {

        if (precalculated == null) {
            initPrecalculatedArray(n);
        }

        if (precalculated[n - 1] != -1) {
            return precalculated[n - 1];
        } else {
            int result = fibWith(n - 1) + fibWith(n - 2);
            precalculated[n - 1] = result;
            return result;
        }

    }

    private void initPrecalculatedArray(int size) {
        precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            precalculated[i] = -1;
        }
        precalculated[0] = 1;
        precalculated[1] = 1;
    }

}