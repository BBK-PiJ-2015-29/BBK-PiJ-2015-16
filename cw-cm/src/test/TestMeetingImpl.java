package test;

import impl.ContactImpl;
import impl.MeetingImpl;
import org.junit.Before;
import org.junit.Test;
import spec.Contact;
import spec.Meeting;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests the MeetingImpl implementation of the interface Meeting.
 */

public class TestMeetingImpl {

    Meeting testMeeting;
    Set<Contact> attendees;
    Contact c1, c2;


    @Before
    public void createTestMeeting() {
        c1 = new ContactImpl(1, "Bob", "A bloke.");
        c2 = new ContactImpl(2, "Fred", "Another dude.");
        attendees = new HashSet<>();
        attendees.add(c1);
        attendees.add(c2);

        Calendar date = new GregorianCalendar(1985, 03, 13);

        testMeeting = new MeetingImpl(1, date, attendees);
    }

    @Test
    public void testID() {
        assertEquals(1, testMeeting.getId());
    }

    @Test
    public void testDate() {
        assertEquals(new GregorianCalendar(1985, 03, 13), testMeeting.getDate());
    }

    @Test
    public void testContacts() {
        assertEquals(attendees, testMeeting.getContacts());
    }

    @Test
    public void testEqualsSame() {
        Set<Contact> attendees2 = new HashSet<>();
        attendees2.add(c1);
        attendees2.add(c2);

        Calendar date2 = new GregorianCalendar(1985, 03, 13);

        Meeting meeting2 = new MeetingImpl(1, date2, attendees2);

        assertTrue(meeting2.equals(testMeeting));
    }

    @Test
    public void testEqualsDateDifferent() {
        Set<Contact> attendees2 = new HashSet<>();
        attendees2.add(c1);
        attendees2.add(c2);

        Calendar date2 = new GregorianCalendar(1985, 04, 13);

        Meeting meeting2 = new MeetingImpl(1, date2, attendees2);

        assertFalse(meeting2.equals(testMeeting));
    }

    @Test
    public void testEqualsAttendeesDifferent() {
        Set<Contact> attendees2 = new HashSet<>();
        attendees2.add(c1);
        attendees2.add(new ContactImpl(2, "Freddie", "Another bloke."));

        Calendar date2 = new GregorianCalendar(1985, 03, 13);

        Meeting meeting2 = new MeetingImpl(1, date2, attendees2);

        assertFalse(meeting2.equals(testMeeting));
    }

    @Test
    public void testEqualsIdsDifferent() {
        Set<Contact> attendees2 = new HashSet<>();
        attendees2.add(c1);
        attendees2.add(c2);

        Calendar date2 = new GregorianCalendar(1985, 03, 13);

        Meeting meeting2 = new MeetingImpl(2, date2, attendees2);

        assertFalse(meeting2.equals(testMeeting));
    }

    @Test
    public void testEqualsDifferentObject() {
        assertFalse(testMeeting.equals("An object"));
    }

}
