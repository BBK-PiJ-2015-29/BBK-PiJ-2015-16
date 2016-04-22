package q1_6_and_1_7;

public interface Book {

    /**
     * Author and Title are set at constructor time and never modified afterwards.
     * (The object Book is an immutable object).
     * <p>
     * The class should have getters for both author and title.
     */

    String getAuthor();

    String getTitle();

    /**
     * @return false if the book is no taken, true if it is taken from the library
     */

    boolean isTaken();

    /**
     * Sets the taken value of the book when it is borrowed or returned
     */

    void setTaken(boolean taken);
}