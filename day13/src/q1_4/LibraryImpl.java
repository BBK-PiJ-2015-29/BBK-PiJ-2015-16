package q1_4;

public class LibraryImpl implements Library {

    private String library;
    private int maxNumberOfBooks;

    /**
     * Constructor.  Sets library name and max number of books
     */

    public LibraryImpl(String library, int maxNumberOfBooks) {
        this.library = library;
        this.maxNumberOfBooks = maxNumberOfBooks;
    }

    @Override
    public String getLibrary() {
        return library;
    }

    @Override
    public int getMaxNumberOfBooks() {
        return this.maxNumberOfBooks;
    }


    // mock method for testing
    @Override
    public int getID() {
        return 13;
    }

}