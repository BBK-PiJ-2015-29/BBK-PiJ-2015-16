package q1_3;

public class BookImpl implements Book {

    private String author;
    private String title;

    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}	