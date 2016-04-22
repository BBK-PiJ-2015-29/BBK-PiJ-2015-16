package q1_6_and_1_7;

public class BookImpl implements Book {
    private String author;
    private String title;
    private boolean taken;

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
}	