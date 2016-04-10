public class Code {
    final static int SIZE = 10;

    public static void main(String[] args) {
        double[] arr = new double[SIZE];

        int N = arr.length;
        double min = 0;
        int minLocation = 0;
        for (int i = 1; i <= N; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minLocation = i;
            }
        }

        System.out.print("The minimal value is arr[");
        System.out.println(minLocation + "] = " + min);
    }
}
