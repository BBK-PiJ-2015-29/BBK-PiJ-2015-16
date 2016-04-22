package q1_10;

public class UserImpl implements User {

    private String name;
    private int ID;
    private Library library;

    public UserImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int register(Library library) {
        this.library = library;
        this.ID = library.getID(this.name);
        return this.ID;
    }

    @Override
    public Library getLibrary() {
        return library;
    }

    @Override
    public Book takeBook(String title) {
        if (countBooksOnLoan() >= library.getMaxNumberOfBooks()) {
            return null;
        }
        return library.takeBook(ID, title);
    }

    @Override
    public String[] getTitlesBorrowedArray() {
        if (countBooksOnLoan() == 0) {
            return null;
        }
        String[] resultArray;
        resultArray = new String[countBooksOnLoan()];
        for (int i = 0; i < countBooksOnLoan(); i++) {
            resultArray[i] = "";
        }
        int k = 0;
        for (int i = 0; i < library.getBookCount(); i++) {
            if (library.getBook(i).getOnLoanTo() == this.ID) {
                resultArray[k] = library.getBook(i).getTitle();
                k++;
            }
        }
        return resultArray;
    }

    public int countBooksOnLoan() {
        int result = 0;
        for (int i = 0; i < library.getBookCount(); i++) {
            if (library.getBook(i).getOnLoanTo() == this.ID) {
                result++;
            }
        }
        return result;
    }
}