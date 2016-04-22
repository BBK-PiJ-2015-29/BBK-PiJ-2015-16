package q1_4;

public class BookImpl implements Book {

    private String author;
    private String title;

    public BookImpl(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }
}	