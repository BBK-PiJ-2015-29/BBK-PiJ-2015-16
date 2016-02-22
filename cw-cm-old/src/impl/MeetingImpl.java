package impl;

import spec.Contact;
import spec.Meeting;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;


/**
 * An Implementation of the class Meeting.
 * <p>
 * Holds and returns the id, date and list of attendees of the meeting.
 * <p>
 * This class does not ensure that ID's are unique, and therefore has a dependency on another class to ensure that IDs provided to this are unique.
 * <p>
 * ContactManagerImpl ensures IDs provided to this are unique.
 */


public class MeetingImpl implements Meeting, Serializable {



    public MeetingImpl(){}

    /**
     * Creates a new MeetingImpl. It should be ensured that ID passed into this is unique elsewhere as this class does not ensure uniqueness.
     *
     * @param id        the ID of the meeting
     * @param date      the date of the meeting
     * @param attendees the attendees of the meeting
     */
    public MeetingImpl(int id, Calendar date, Set<Contact> attendees) {
        throw new NotImplementedException();
    }

    @Override
    public int getId() {
        throw new NotImplementedException();
    }

    @Override
    public Calendar getDate() {
        throw new NotImplementedException();
    }

    @Override
    public Set<Contact> getContacts() {
        throw new NotImplementedException();
    }

    @Override
    public boolean equals(Object other) {
        throw new NotImplementedException();
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }

}
