package q5.simpleMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SimpleMapTest {

    private SimpleMap sm;
    private int m;
    private int e;

    @Before
    public void setUp() {
        sm = new SimpleMapImpl();
        m = ("Marvin").hashCode();
        m = HashUtilities.shortHash(m);
        e = ("Elizabeth").hashCode();
        e = HashUtilities.shortHash(e);
        sm.put(m, "Marvin");
        sm.put(e, "Elizabeth");
    }

    @Test
    public void testGetNameThatHasBeenPut() {
        assertEquals("Marvin", sm.get(m));
    }

    @Test
    public void testPutNameOnKeyThatAlreadyHasNameAccoc() {
        sm.put(m, "turbo");
        assertEquals("Marvin", sm.get(m));
    }

    @Test
    public void testGetWhenNoNameAssocWithKeyReturnsNull() {
        assertNull(sm.get(7));
    }

    @Test
    public void testRemoveName() {
        sm.remove(m);
        assertNull(sm.get(m));
    }

    @Test
    public void testRemoveNameAndThenPutNameToKey() {
        sm.remove(m);
        sm.put(m, "Monkey");
        assertEquals("Monkey", sm.get(m));
    }

    @Test
    public void testIsEmptyWhenNotEmpty() {
        assertFalse(sm.isEmpty());
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        sm.remove(m);
        sm.remove(e);
        assertTrue(sm.isEmpty());
    }

}















