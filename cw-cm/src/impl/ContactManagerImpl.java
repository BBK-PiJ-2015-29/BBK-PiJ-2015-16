package impl;

import spec.Contact;
import spec.ContactManager;
import spec.FutureMeeting;
import spec.Meeting;
import spec.PastMeeting;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

/**
 * This is an implementation of the ContactManager interface. Several assumptions have been
 * made for this implementation of ContactManager:
 * <ul>
 * <li>Duplicates: Where methods specify removing duplicates from a list, meetings are determined as duplicate
 * if their time and attendees match (i.e. IDs and notes can  be different).</li>
 * <li>Unique IDs are managed by ContactManager: It was assumed that ContactManager should determine the Meeting
 * and Contact ID's (reasons provided within code).</li>
 * <li>PastMeeting's can be in future: addPastMeeting() does not return an exception when adding a meeting with a
 * future date. PastMeeting's with future dates
 * will be returned in the getFutureMeeting lists but will not be provided by getFutureMeeting(id) as it would need
 * to be cast as a FutureMeeting </li>
 * <li>FutureMeeting's changed to PastMeeting: within the getPastMeeting type methods where it is seen that a
 * FutureMeeting is now in the Past due to time passing,
 * it will be converted to a PastMeeting within the ContactManager.</li>
 * <li>Interpretation of past and future is by date not type: Generally speaking, where a search for a past of
 * future meeting is made it is searched by date, not by class type.
 * <li>Assigning to notes to something already with notes will overwrite the previous notes.</li>
 * <li>Any changes (i.e. meetings and contacts being added) are saved to the file immediately when they are made</li>
 * <li>Bespoke Calendar implementations (not Gregorian Calendar) such as those created by the user will lose any
 * functionality not provided by Calendar when reloaded by ContactManager.</li>
 * <li>Null inputs: addFutureMeeting(Contacts,Date) does not specify a NullPointerException if any of the input
 * parameters are null. Null parameters therefore return an IllegalArgumentException as this is within the
 * specification, although a NullPointerException would be more appropriate.</li>
 * <li>Empty Names: Adding a contact with an empty name "" is not allowed, and treated as a null. This is
 * consistent with not being able to search for "" in contacts.</li>
 * <li>ID's Positive: The ID's this ContactManager uses are all positive.
 * There is therefore a maximum 2^31 - 1 possible contacts and meetings.</li>
 * </ul>
 */

public class ContactManagerImpl implements ContactManager, Serializable {


    /**
     * Default constructor using the default "Contact.txt" file.
     *
     * @throws IllegalStateException if the data file is not in the correct format
     */
    public ContactManagerImpl() throws IllegalStateException {
        throw new NotImplementedException();
    }

    /**
     * Constructor where the user sets the location of the save file.
     *
     * @param fileLocation the location of the file to be used.
     * @throws IllegalStateException if the data file is not in the correct format
     */
    public ContactManagerImpl(String fileLocation) throws IllegalStateException {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Returns an IllegalArgumentException if any of the inputs are null.
     */

    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) throws IllegalArgumentException {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Should a FutureMeeting exist which is now in the past,
     * the meeting will be converted to as PastMeeting with no notes
     * when this method is run.
     */
    @Override
    public PastMeeting getPastMeeting(int id) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Should a meeting be in the future but be of the class PastMeeting, an IllegalArugmentException will be thrown.
     */
    @Override
    public FutureMeeting getFutureMeeting(int id) throws IllegalArgumentException {
        throw new NotImplementedException();
    }

    @Override
    public Meeting getMeeting(int id) {
        throw new NotImplementedException();
    }

    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Duplicate meetings, determined by have the same contacts and time, are removed.
     */
    @Override
    public List<Meeting> getFutureMeetingList(Calendar date) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Duplicate meetings, determined by have the same contacts and time, are removed.
     * <p>
     * Should a meeting be in the past but be of class FutureMeeting,
     * it will be changed within ContactManager to a PastMeeting.
     */
    @Override
    public List<PastMeeting> getPastMeetingList(Contact contact) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * PastMeeting's can be added in the future.
     */

    @Override
    public void addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Running this method on a meeting with notes already will overwrite the current notes of the PastMeeting.
     */

    @Override
    public void addMeetingNotes(int id, String text) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Adding a contact with the name as the empty string "" is also
     * not allowed and results in a NullPointerException. This
     * is consistent with not being able to search for names with an empty string.
     */
    @Override
    public void addNewContact(String name, String notes) {
        throw new NotImplementedException();
    }

    @Override
    public Set<Contact> getContacts(int... ids) {
        throw new NotImplementedException();
    }

    /**
     * {@inheritDoc}}
     * <p>
     * Searches by name are case sensitive.
     */
    @Override
    public Set<Contact> getContacts(String name) {
        throw new NotImplementedException();
    }

    @Override
    public void flush() {
        throw new NotImplementedException();
    }
}
