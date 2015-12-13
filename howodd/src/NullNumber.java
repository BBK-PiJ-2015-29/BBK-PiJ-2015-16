public class NullNumber {
    static int luckyNumber = 21;

    public static NullNumber getInstance() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(NullNumber.getInstance());
        System.out.println(NullNumber.getInstance().luckyNumber);
    }
}