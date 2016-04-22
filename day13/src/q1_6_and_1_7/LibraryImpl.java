package q1_6_and_1_7;

public class LibraryImpl implements Library {
    private String[] readerArray;
    private Book[] bookArray;
    private int readerCount;
    private int bookCount;
    private int bookBorrowedCount;
    private String library;
    private int maxNumberOfBooks;

    /**
     * Constructor.  Sets library name and max number of books
     */

    public LibraryImpl(String library, int maxNumberOfBooks) {
        this.library = library;
        this.maxNumberOfBooks = maxNumberOfBooks;
        readerCount = 0;
        readerArray = new String[5];
        bookCount = 0;
        bookArray = new Book[5];
        for (int i = 0; i < 5; i++) {
            bookArray[i] = null;
        }
        bookBorrowedCount = 0;
    }

    @Override
    public String getLibrary() {
        return library;
    }

    @Override
    public int getMaxNumberOfBooks() {
        return this.maxNumberOfBooks;
    }

    /**
     * Setter for maxNumberOfBooks, allows this to be updated at any time.
     */

    @Override
    public void setMaxNumberOfBooks(int maxNumberOfBooks) {
        this.maxNumberOfBooks = maxNumberOfBooks;
    }

    @Override
    public int getID(String name) {
        for (int i = 0; i < readerCount; i++) {
            if (readerArray[i].equals(name)) {
                return i + 1;
            }
        }
        readerArray[readerCount] = name;
        readerCount++;
        return readerCount;
    }

    // for 1.6

    @Override
    public void addBook(String title, String author) {
        bookArray[bookCount] = new BookImpl(title, author);
        bookCount++;
    }

    /**
     * If the book is not taken, marks the book as taken and returns it.
     * If the book is taken, null is returned
     *
     * @param title of the book being taken
     * @return the book that is being taken
     */
    @Override
    public Book takeBook(String title) {
        int i = 0;
        while (bookArray[i] != null && i < bookArray.length - 1) {
            if (bookArray[i].getTitle().equals(title) && !bookArray[i].isTaken()) {
                bookArray[i].setTaken(true);
                bookBorrowedCount++;
                return bookArray[i];
            }
            i++;
        }
        return null;
    }


    /**
     * Marks the book as not taken
     *
     * @param book to be returned
     */
    @Override
    public void returnBook(Book book) {
        int i = 0;
        while (bookArray[i] != null && i < bookArray.length - 1) {
            if (bookArray[i].getTitle().equals(book.getTitle())) {
                bookArray[i].setTaken(false);
                bookBorrowedCount--;
                ;
                return;
            }
            i++;
        }
    }

    /**
     * @return the number of users registered in this library
     */
    @Override
    public int getReaderCount() {
        return readerCount;
    }

    /**
     * @return the number of books in this library
     */

    @Override
    public int getBookCount() {
        return bookCount;
    }

    /**
     * @returns the number of borrowed books in this library
     */

    @Override
    public int getBookBorrowedCount() {
        return bookBorrowedCount;
    }
}

















