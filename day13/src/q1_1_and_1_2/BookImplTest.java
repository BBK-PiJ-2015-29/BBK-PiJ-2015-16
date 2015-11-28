package q1_1_and_1_2;

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
