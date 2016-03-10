package test;

import impl.PastMeetingImpl;
import interfaces.Contact;
import interfaces.PastMeeting;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PastMeetingTest {

    Calendar pastDate;
    Set<Contact> contacts;
    PastMeeting pastMeeting;

    @Before
    public void setUp() {
        pastDate = Calendar.getInstance();
        pastDate.add(Calendar.YEAR, -1);
        contacts = new HashSet<Contact>();
        contacts.add(new MockContactImpl());
        contacts.add(new MockContactImpl());
        pastMeeting = new PastMeetingImpl(pastDate, contacts);
    }

    @Test
    public void testGetNotesNone() {
        assertEquals("", pastMeeting.getNotes());
    }

    @Test
    public void testAddNotesSingle() {
        pastMeeting.addNotes("Notes 1");

        assertTrue(pastMeeting.getNotes().contains("Notes 1"));
    }

    @Test
    public void testAddNotesMultiple() {
        pastMeeting.addNotes("Notes 1");
        pastMeeting.addNotes("Notes 2");

        assertTrue(pastMeeting.getNotes().contains("Notes 1"));
        assertTrue(pastMeeting.getNotes().contains("Notes 2"));
    }
}