package q2_1;

public interface IntSet {

    /**
     * adds a new int to the set, false otherwise
     */

    void add(int newNumber);

    /**
     * returns true if the number is in the set, false otherwise
     */

    boolean contains(int checkNumber);

    /**
     * returns the same values as contains(int), but for every element that is checked
     * prints its value on the screen
     */

    boolean containsVerbose(int checkNumber);

    /**
     * returns a string with the values of the elements in the set separatated by commas
     */

    String toString();
}
