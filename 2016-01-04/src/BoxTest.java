public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intbox = new Box<>(3);
        System.out.println(intbox);
        //Box<String> strbox = new Box<>("thing");
        //System.out.println(strbox);
        Box<Long> longbox = new Box<>(3L); // 3L == (long)3
        System.out.println(longbox);
    }
}

class Box<T extends Number> {
    private T i;

    public Box(T i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "The value is " + i;
    }
}

