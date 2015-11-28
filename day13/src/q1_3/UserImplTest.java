package q1_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserImplTest {

    // tests for 1.1 and 1.2

    @Test
    public void testConstructorAndGetterForName() {
        User u = new UserImpl("Anna");
        assertEquals("Anna", u.getName());
    }

    @Test
    public void testGetterForIDBeforeIDSet() {
        User u = new UserImpl("Anna");
        assertEquals(0, u.getID());
    }

    @Test
    public void testGetterForIDAfterIDSet() {
        User u = new UserImpl("Anna");
        u.setID(11);
        assertEquals(11, u.getID());
    }

    // additional tests for 1.3

    @Test
    public void testGetLibrary() {
        User u = new UserImpl("Anna");
        Library bbk = new Library();
        u.register(bbk);
        assertEquals(bbk, u.getLibrary());
    }

    @Test
    public void testRegisterGetsTheUserID13() {
        User u = new UserImpl("Anna");
        Library bbk = new Library();
        u.register(bbk);
        assertEquals(13, u.register(bbk));
        assertEquals(13, u.getID());
    }


}	