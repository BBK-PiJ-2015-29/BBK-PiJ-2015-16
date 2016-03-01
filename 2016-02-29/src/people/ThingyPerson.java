package people;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Person {
    void myMethod();

    default void myOtherMethod(int x, int y) {
        System.out.println("I'm defaulted..." + x + "," + y);
    }
}

class PersonImpl implements Person {
    @Override
    public void myMethod() {
        System.out.println("asidhasdkhj");
    }

//    @Override
//    public void myOtherMethod(int x, int y) {
//
//    }
}

public class ThingyPerson {
    private static final List<Integer> LIMITS = Arrays.asList(1, 2, 3, 4, 5, 1000, 3000);

    public static void main(String... args) {
        Person p = new PersonImpl();
        p.myMethod();
        p.myOtherMethod(3, 4);

        for (final int x : LIMITS) {
            new Dooo().method(LIMITS, x);
        }


    }
}

class Dooo {   // don't repeat - parameterize (DRY)
    private static final int START = 1;

    void method(List a, final int LIMIT) {
        for (int i = START; i <= LIMIT; i++)
            a.add(i);
    }
}
