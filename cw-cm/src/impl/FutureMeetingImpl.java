package impl;

import spec.Contact;
import spec.FutureMeeting;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

/**
 * An implementation of the FutureMeeting interface.
 */

public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting, Serializable {

    public FutureMeetingImpl(int id, Calendar date, Set<Contact> attendees) {
        super(id, date, attendees);
    }
}
