package q1_10;

public interface Library {

    String getLibrary();

    /**
     * Setter for maxNumberOfBooks, allows this to be updated at any time.
     */

    String[] setMaxNumberOfBooks(int maxNumberOfBooks);

    /**
     * @return the current value of the library's maxNumberOfBooks per user
     */

    int getMaxNumberOfBooks();

    /**
     * Provides a unique ID for each unique name, creating an ID for new users
     *
     * @param userName of the user
     * @return the unique ID of the user
     */

    int getID(String userName);


    Book getBook(int i);

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

    Book takeBook(int ID, String title);

    /**
     * Marks the book as not taken
     *
     * @param book to be returned to the library
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

    /**
     * @return an array of containing the names of all users borrowing books at the moment
     */

    String[] userBorrowingArray();

    /**
     * @return an array of containing the names of all users
     */

    String[] userArray();

    /**
     * @return the name of the person borrowing a title (null if book not on loan or not
     * existing in library.
     */

    String userLoanedTo(String title);


}