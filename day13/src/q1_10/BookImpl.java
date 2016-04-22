package q1_10;

public class BookImpl implements Book {
    private String author;
    private String title;
    private boolean taken;
    private int onLoanTo;

    public BookImpl(String title, String author) {
        this.title = title;
        this.author = author;
        this.taken = false;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean isTaken() {
        return this.taken;
    }

    @Override
    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    @Override
    public int getOnLoanTo() {
        return onLoanTo;
    }

    @Override
    public void setOnLoanTo(int ID) {
        this.onLoanTo = ID;
    }

}	