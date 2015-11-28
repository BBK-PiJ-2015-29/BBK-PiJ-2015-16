package q1_4;

public interface Library {

    String getLibrary();

    int getID();

    /**
     * Setter for maxNumberOfBooks, allows this to be updated at any time.
     */

//	void setMaxNumberOfBooks(int maxNumberOfBooks);

    /**
     * @Return the current value of maxNumberOfBooks per user
     */

    int getMaxNumberOfBooks();
}