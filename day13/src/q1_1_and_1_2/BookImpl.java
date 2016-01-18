package q1_1_and_1_2;

public class BookImpl implements Book {
    private final String author;
    private final String title;

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