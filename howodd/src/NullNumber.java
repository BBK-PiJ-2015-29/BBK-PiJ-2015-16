public class NullNumber {
    static int luckyNumber = 21;

    public static NullNumber get() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(NullNumber.get());
        System.out.println(NullNumber.get().luckyNumber);
    }
}