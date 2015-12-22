package test;

import impl.ContactImpl;
import org.junit.Before;
import org.junit.Test;
import spec.Contact;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

/**
 * Tests the ContactImpl implementation of interface Contact.
 */

public class TestContactImpl {
    Contact ct;
    Contact ct2;
    String name;
    String notes1, notes2;
    int id;

    @Before
    public void setUp() {
        id = 65;
        name = "Bob";
        notes1 = "Line 1.";
        notes2 = "Line 2.";

        ct = new ContactImpl(id, name, notes1);
        ct2 = new ContactImpl(id, name, notes2);
    }


    @Test
    public void testID() {
        assertEquals(id, ct.getId());
    }


    @Test
    public void testName() {
        assertEquals(name, ct.getName());
    }

    @Test
    public void testNameWithSpaces() {
        ct = new ContactImpl(id, "Fred dy", notes1);
        assertEquals("Fred dy", ct.getName());
    }

    @Test
    public void testNullName() {
        ct = new ContactImpl(id, null, notes1);
        assertNull(ct.getName());
    }


    @Test
    public void testEmptyNameString() {
        ct = new ContactImpl(id, "", notes1);
        assertEquals("", ct.getName());
    }

    @Test
    public void testNotesFromConstructor() {
        assertEquals(notes1, ct.getNotes());
    }

    @Test
    public void testNotesFromConstructorNameNull() {
        Contact ct = new ContactImpl(id, null, notes1);
        assertEquals(notes1, ct.getNotes());
    }

    @Test
    public void testEmptyNotesFromConstructor() {
        Contact ct = new ContactImpl(id, name, "");
        assertEquals("", ct.getNotes());
    }

    @Test
    public void testNullNotesFromConstructor() {
        Contact ct = new ContactImpl(id, name, null);
        assertNull(ct.getNotes());
    }

    @Test
    public void testAddNotesToEmpty() {
        Contact ct = new ContactImpl(id, name, "");
        ct.addNotes(notes1);
        assertEquals(notes1, ct.getNotes());
    }

    @Test
    public void testAddNotesToNull() {
        Contact ct = new ContactImpl(id, name, null);
        ct.addNotes(notes1);
        assertEquals(notes1, ct.getNotes());
    }

    @Test
    public void testAddNullNotes() {
        Contact ct = new ContactImpl(id, name, notes1);
        ct.addNotes(null);
        assertEquals(notes1, ct.getNotes());
    }

    @Test
    public void testAddNotesToNonEmpty() {
        Contact ct = new ContactImpl(id, name, notes1);
        ct.addNotes(notes2);
        assertEquals(notes1 + notes2, ct.getNotes());
    }

    @Test
    public void testEqualsAllSame() {
        ct = new ContactImpl(id, name, notes1);
        ct2 = new ContactImpl(id, name, notes1);

        assertEquals(ct,ct2);
    }

    @Test
    public void testEqualsDifferentObject() {
        assertNotEquals(ct,"A string");
    }

    @Test
    public void testEqualsNameDifferent() {
        ct2 = new ContactImpl(id,"Freddie", notes1);
        assertNotEquals(ct,ct2);
    }

    @Test
    public void testEqualsIDDifferent() {
        ct2 = new ContactImpl(1,name,notes1);
        assertNotEquals(ct,ct2);
    }

    @Test
    public void testEqualsNotesDifferent() {
        assertNotEquals(ct,ct2);
    }
}
