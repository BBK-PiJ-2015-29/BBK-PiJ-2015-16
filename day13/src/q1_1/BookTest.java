package q1_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {
    private Book bk;
    private final static String title = "A silly book";
    private final static String author = "Fred";

    @Before
    public void setup() {
        bk = new BookImpl(author, title);
    }

    @Test
    public void testGetAuthor() {
        assertEquals(author, bk.getAuthor());
    }

    @Test
    public void testGetTitle() {
        assertEquals(title, bk.getTitle());
    }

}
