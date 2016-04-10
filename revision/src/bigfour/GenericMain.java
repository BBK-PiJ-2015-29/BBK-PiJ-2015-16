package bigfour;

import java.util.Optional;

public class GenericMain {

    public static void main(String[] args) {
        //1. works for Integers
        Generic<Integer> gi = new GenericImpl<>();
        gi.add(3);
        gi.add(5);
        gi.add(7);

        print(gi.find(x -> x > 5));
        print(gi.find(x -> x < 5));


        //2. works for Strings
        Generic<String> gi2 = new GenericImpl<>();
        gi2.add("frog");
        gi2.add("backbone");
        gi2.add("zebra");

        print(gi2.find(x -> x.compareTo("g") > 0));
        print(gi2.find(x -> x.contains("c")));

        //3. works for Person (which implements Comparable)
        Generic<Person> gi3 = new GenericImpl<>();
        gi3.add(new PersonImpl(1968, "Mark"));
        gi3.add(new PersonImpl(1966, "Cathy"));
        gi3.add(new PersonImpl(1998, "Tom"));

        print(gi3.find(x -> x.compareTo(new PersonImpl(1970, "Daisy")) > 0));
        print(gi3.find(x -> x.getName().contains("y")));
    }

    private static <T> void print(Optional<T> result) {
        System.out.println((result.isPresent()) ? result.get().toString() : "nothing found");
    }
}

