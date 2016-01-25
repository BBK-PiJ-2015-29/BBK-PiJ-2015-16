package binary;

public class BinarySearch {

    public static boolean contains(int[] list, int n) {
        if (list.length == 0) return false;

        if (list.length % 2 == 0) {
            if (list[(list.length / 2) - 1] == n) return true;
            if (list[(list.length / 2) - 1] > n) return contains(first(list, (list.length / 2) - 1), n);
            return contains(last(list, (list.length / 2) - 1), n);
        }

        if (list[((list.length - 1) / 2)] == n) return true;
        if (list[((list.length - 1) / 2)] > n) return contains(first(list, (list.length - 1) / 2), n);
        return contains(last(list, ((list.length - 1) / 2)), n);
    }


    private static int[] first(int[] list, int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = list[i];
        }

        return output;
    }

    private static int[] last(int[] list, int n) {
        int[] output = new int[n];
        if (n == 0) return output;
        int c = 0;
        for (int i = (list.length - n); i < list.length; i++) {
            output[c] = list[i];
            c++;
        }

        return output;
    }


}


