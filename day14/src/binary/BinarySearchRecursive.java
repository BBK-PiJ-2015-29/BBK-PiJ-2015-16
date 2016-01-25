package binary;

public class BinarySearchRecursive {


    // need extra "helper" method, feed in params
    public static boolean binarySearch(int[] a, int x) {
        if (a.length == 0) return false;
        return binarySearch(a, x, 0, a.length - 1);
    }

    // need extra low and high parameters
    private static boolean binarySearch(int[] a, int x,
                                        int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (a[mid] == x) return true;
        else if (a[mid] < x)
            return binarySearch(a, x, mid + 1, high);
        else // last possibility: a[mid] > x
            return binarySearch(a, x, low, mid - 1);
    }
}

class BinarySearchTest {
    public static void main(String[] args) {
        int[] a =
                {2, 8, 12, 14, 16, 19, 24, 28, 31, 33,// 0-9
                        39, 40, 45, 49, 51, 53, 54, 56, 57, 60,// 10-19
                        63, 69, 77, 82, 88, 89, 94, 96, 97};  // 20-28

        System.out.println();
        System.out.print(BinarySearchRecursive.binarySearch(a, 1) + " ");
        System.out.print(BinarySearchRecursive.binarySearch(a, 26) + " ");
        System.out.print(BinarySearchRecursive.binarySearch(a, 77) + " ");
        System.out.print(BinarySearchRecursive.binarySearch(a, 94) + " ");
        System.out.println();
    }
}