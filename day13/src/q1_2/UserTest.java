package q1_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

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

}