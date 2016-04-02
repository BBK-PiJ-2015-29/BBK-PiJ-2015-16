package q12;

/**
 * An interface for which lambdas can be used. See StringUtils for
 * examples of USING this interface in code, which are more or less the same
 * as in Java 7. But, see IsBetterExamples for examples of PASSING IN
 * instances of this interface, where now in Java 8 you can use lambdas.
 * Also see TwoElementPredicate for a genericised version of this interface.
 */

// Adding the following annotation does not change the behavior of CORRECT
// code in any way. But, see the "blah" method at the bottom.
@FunctionalInterface
public interface TwoStringPredicate {
    /**
     * Returns true if the first String is "better" than the second one,
     * returns false otherwise. Concrete classes (or lambdas) that implement
     * this interface give meaning to their definition of "better".
     */
    boolean isBetter(String s1, String s2);

    // Using @FunctionalInterface means that if you try to add a second
    // method (as below), you will get a compile-time error in this interface.
    //void blah();
}
