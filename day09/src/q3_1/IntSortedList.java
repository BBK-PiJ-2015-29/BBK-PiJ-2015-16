package q3_1;

public interface IntSortedList {

    /**
     * Adds a new int to the list so that the list remains sorted;
     * a list can contain duplicates unlike a set.
     */

    void add(int newNumber);

    /**
     * returns true if the number is in the list, false otherwise
     */

    boolean contains(int checkNumber);

    /**
     * returns a string with the values of the elements int he list separated by commas
     */

    String toString();


}