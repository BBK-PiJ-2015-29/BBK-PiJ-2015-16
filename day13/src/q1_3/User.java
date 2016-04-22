package q1_3;

public interface User {

    //getters
    String getName();

    int getID();

    /**
     * Users have a name and a Library-ID (an int), both of which must be unique
     * in a library.  The name is set at construction time, but the library-ID is not.
     * /
     * <p>
     * /**
     * The class must have methods to get name and ID and to set ID.
     */

    void setID(int id);

    /**
     * gets the library that the user is registered with
     */

    Library getLibrary();

    /**
     * The way to obtain the user-ID. Sets the user's library field to library
     * and returns an ID obtained from that library
     */

    int register(Library library);

}