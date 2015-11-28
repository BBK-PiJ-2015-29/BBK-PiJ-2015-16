package q1_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryImplTest {

    //test from BookImplTest

    User u;

    //tests from UserImplTest
    User z;
    Library bbk;

    @Test
    public void testBookConstructorAndGetters() {
        Book b = new BookImpl("Mark", "Food");
        assertEquals("Mark", b.getAuthor());
        assertEquals("Food", b.getTitle());
    }

    @Before
    public void setUp() {
        u = new UserImpl("Anna");
        z = new UserImpl("Mark");
        bbk = new LibraryImpl("Birkbeck", 3);
    }

    // tests for 1.1 and 1.2

    @Test
    public void testConstructorAndGetterForName() {
        assertEquals("Anna", u.getName());
    }

    @Test
    public void testGetterForIDBeforeIDSet() {
        assertEquals(0, u.getID());
    }

    @Test
    public void testGetterForIDAfterIDSet() {
        u.setID(11);
        assertEquals(11, u.getID());
    }

    // additional tests for 1.3

    @Test
    public void testGetLibrary() {
        u.register(bbk);
        assertEquals(bbk, u.getLibrary());
    }

    @Test
    public void testRegisterGetsTheUserID1() {
        u.register(bbk);
        assertEquals(1, u.register(bbk));
        assertEquals(1, u.getID());
    }

    //additional tests for 1.4 Library's constructor

    @Test
    public void testsSettingNameOfLibraryInConstructor() {
        assertEquals("Birkbeck", bbk.getLibrary());
    }

    @Test
    public void testSettingMaxNumberOfBooksToThreeInConstructor() {
        assertEquals(3, bbk.getMaxNumberOfBooks());
    }

    @Test
    public void testSettingMaxNumberOfBooksToFiveAtAnyTime() {
        bbk.setMaxNumberOfBooks(5);
        assertEquals(5, bbk.getMaxNumberOfBooks());
    }

    //additional tests for 1.5 getId(String) in Library

    @Test
    public void testsCreatingANewIDForANewUser() {
        assertEquals(1, bbk.getID("Mark"));
        assertEquals(2, bbk.getID("Ellie"));
    }

    @Test
    public void testsGettingAnIDForAnExistingUser() {
        u.register(bbk);
        z.register(bbk);
        assertEquals(1, bbk.getID("Anna"));
        assertEquals(2, bbk.getID("Mark"));
    }

    @Test
    public void testsSubsequentIDSame() {
        u.register(bbk);
        z.register(bbk);
        assertEquals(1, bbk.getID("Anna"));
        assertEquals(2, bbk.getID("Mark"));
        assertEquals(1, bbk.getID("Anna"));
    }


}



























