public class Equals {
    //  The JVM caches integer values between -128 and 128. So == equals equals in this case.
    public static void main(String[] args) {
        Integer a = 123;
        Integer b = 123;
        test(a, b);
        a = 256;
        b = 256;
        test(a, b);
    }

    static void test(Integer a, Integer b) {
        System.out.println("So do these have the same reference? a = " + a + " b = " + b);

        if (a == b)
            System.out.println("YES!");
        else
            System.out.println("NO");
    }
}
