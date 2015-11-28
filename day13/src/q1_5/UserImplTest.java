package q1_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserImplTest {

    //refactored tests on User still using mock Library object

    User u;
    Library bbk;

    @Before
    public void setUp() {
        u = new UserImpl("Anna");
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
    public void testRegisterGetsTheUserID13() {
        u.register(bbk);
        assertEquals(13, u.register(bbk));
        assertEquals(13, u.getID());
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

}	