package q5.doublyLinkedLists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PatientTest {

    Patient p;

    @Before
    public void setUp() {
        p = new Patient();
    }

    @Test
    public void testEnterTwoTheDeleteOneOfThePatient() {
        Patient marvin = new Patient("Marvin", 17, "Broken leg");
        Patient arnie = new Patient("Arnie", 17, "spots");
        p.addPatient(marvin);
        p.addPatient(arnie);
        assertTrue(p.deletePatient(marvin));
    }

    // this test fails....  need to fix the code for the list (way head is done is grim)
    @Test
    public void testEnterTwoTheDeleteBothPatients() {
        Patient marvin = new Patient("Marvin", 17, "Broken leg");
        Patient arnie = new Patient("Arnie", 17, "spots");
        p.addPatient(marvin);
        p.addPatient(arnie);
        assertTrue(p.deletePatient(marvin));
        assertTrue(p.deletePatient(arnie));

    }

    @Test
    public void testDeleteAPatientNotInList() {
        Patient marvin = new Patient("Marvin", 17, "Broken leg");
        assertFalse(p.deletePatient(marvin));
    }

    @Test
    public void testDeleteAlPatientNoLongerInList() {
        Patient marvin = new Patient("Marvin", 17, "Broken leg");
        Patient arnie = new Patient("Arnie", 17, "spots");
        p.addPatient(marvin);
        p.addPatient(arnie);
        assertTrue(p.deletePatient(marvin));
        assertFalse(p.deletePatient(marvin));
    }


}