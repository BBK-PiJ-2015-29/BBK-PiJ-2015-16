package q1_5;

public interface Library {

    String getLibrary();

    //mock? use getID(String) ??

//	int getID();

    /**
     * @return the current value of the library's maxNumberOfBooks per user
     */

    int getMaxNumberOfBooks();

    /**
     * Setter for maxNumberOfBooks, allows this to be updated at any time.
     */

    void setMaxNumberOfBooks(int maxNumberOfBooks);

    /**
     * Provides a unique ID for each unique name, creating an ID for new users
     *
     * @param the name of the user
     * @return the unique ID of the user
     */

    int getID(String userName);

}