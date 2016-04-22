package q1_6_and_1_7;

public interface Library {

    String getLibrary();

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
     * @param userName of the user
     * @return the unique ID of the user
     */

    int getID(String userName);

// for 1.6

    /**
     * Adds a new book to the list of books in this library
     * Constructs the book and stores it in the library
     *
     * @param title  book title
     * @param author book author
     */

    void addBook(String title, String author);

    /**
     * If the book is not taken, marks the book as taken and returns it.
     * If the book is taken, null is returned
     *
     * @param title of the book being taken
     * @return the book that is being taken
     */

    Book takeBook(String title);

    /**
     * Marks the book as not taken
     *
     * @param book to be returned
     */

    void returnBook(Book book);

    // for 1.7

    /**
     * @return the number of users registered in this library
     */

    int getReaderCount();

    /**
     * @return the number of books in this library
     */

    int getBookCount();

    /**
     * @returns the number of borrowed books in this library
     */

    int getBookBorrowedCount();


}