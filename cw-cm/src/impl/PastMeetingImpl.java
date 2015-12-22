package impl;

import spec.Contact;
import spec.Meeting;
import spec.PastMeeting;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

/**
 * An implementation of PastMeeting by extending MeetingImpl.
 * <p>
 * Holds and returns the id, date, list of attendees and notes of the meeting.
 * <p>
 * This class does not ensure that ID's are unique, and therefore has a dependency on
 * another class to ensure that IDs provided to this are unique.
 * <p>
 * ContactManagerImpl ensures IDs provided to this are unique.
 */

public class PastMeetingImpl extends MeetingImpl implements PastMeeting, Serializable {
    /**
     * A constructor to turn a Meeting into and PastMeeting. Note this does not
     * delete the previous meeting but does duplicate its
     * ID. The user should therefore ensure deletion of the previous meeting.
     *
     * @param currentMeeting the meeting to be turned into a PastMeeting
     * @param notes          the notes for this meeting
     */

    public PastMeetingImpl(Meeting currentMeeting, String notes) {
        throw new NotImplementedException();
    }

    /**
     * A constructor to produce a new PastMeeting. ID not guaranteed to be unique.
     *
     * @param id        the id of the meeting
     * @param date      the date the meeting took place
     * @param attendees the attendees of the meeting
     * @param notes     the note of the meeting
     */

    public PastMeetingImpl(int id, Calendar date, Set<Contact> attendees, String notes) {
        throw new NotImplementedException();
    }

    @Override
    public String getNotes() {
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
