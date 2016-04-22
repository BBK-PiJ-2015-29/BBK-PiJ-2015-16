package q1_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookImplTest {

    @Test
    public void testBookConstructorAndGetters() {
        Book b = new BookImpl("Mark", "Food");
        assertEquals("Mark", b.getAuthor());
        assertEquals("Food", b.getTitle());
    }

}	
