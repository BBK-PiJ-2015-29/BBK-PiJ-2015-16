package misc;

public class MergeSort {
    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        merge(a, aux, lo, mid, hi); // merges 2 sorted subarrays into a[lo..hi-1].
        System.out.print(lo + " " + hi + " ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        sort(a, aux, 0, N);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

    }
}
