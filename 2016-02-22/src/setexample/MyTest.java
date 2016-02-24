package setexample;

public class MyTest {
    final static int MAX = 100;

    public static void main(String[] args) {
        Set<Integer> msint = new MySet<>();
        Set<Integer> other = new MySet<>();


        for (int i = 1; i <= MAX; i++)
            msint.add(i);

        System.out.println(msint);

        for (int i = 1; i <= MAX / 2; i++)
            other.add(i);

        System.out.println(other);

        System.out.println(msint.subset(other));
        System.out.println(other.subset(msint));

        Set<Colours> mscol = new MySet<>();
        Set<Colours> colother = new MySet<>();


        mscol.add(new Blue());
        mscol.add(new Green());
        mscol.add(new Red());
        mscol.add(new Orange());

        System.out.println(mscol);

        colother.add(new Blue());
        colother.add(new Green());

        System.out.println(colother);

        System.out.println(mscol.subset(colother));
        System.out.println(colother.subset(mscol));


    }
}
