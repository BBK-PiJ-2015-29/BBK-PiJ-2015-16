package circularlists;

public class HospitalManager {

    private Patient patientListStart = null;

    public static void main(String[] args) {
        HospitalManager hm = new HospitalManager();
        hm.launch();
    }

    private void launch() {

        //part 1: create the list
        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        //make start
        patientListStart = firstPatient;
        //point start back to itself
        patientListStart.setNextPatient(patientListStart);
        //add rest of patients
        Patient secondPatient = new Patient("Mary", 66, "Meningitis");
        patientListStart.addPatient(secondPatient);
        Patient thirdPatient = new Patient("Sue", 16, "Headache");
        patientListStart.addPatient(thirdPatient);
        Patient anotherPatient = new Patient("Jane", 26, "Broken leg");
        patientListStart.addPatient(anotherPatient);
        Patient anotherPatientTwo = new Patient("Tom", 16, "Shoulder");
        patientListStart.addPatient(anotherPatientTwo);
        Patient patient6 = new Patient("Cathy", 48, "Ears xx");
        patientListStart.addPatient(patient6);
        Patient patient7 = new Patient("JohnK", 34, "Weight xx");
        patientListStart.addPatient(patient7);
        Patient patient8 = new Patient("Jim", 84, "Knees xx");
        patientListStart.addPatient(patient8);
        Patient patient9 = new Patient("Benny", 98, "Cold xx");
        patientListStart.addPatient(patient9);
        Patient patient10 = new Patient("Duchess", 77, "Cat xx xx");
        patientListStart.addPatient(patient10);

        //part2 test
        printPatients();

        //parts 3 & 4 test
        boolean deleted;
        deleted = patientListStart.deletePatient(patient8);
        System.out.println("Jim deleted: " + deleted);
        printPatients();
        deleted = patientListStart.deletePatient(anotherPatient);
        System.out.println("Jane deleted: " + deleted);
        printPatients();

        //part 5 test
        System.out.println("adding patient Mr Lunchman");
        Patient patient99 = new Patient("Lunchman", 22, "Very hungry");
        patientListStart.addPatient(patient99);
        printPatients();
        Patient patientNotOnList = new Patient("Daisy", 99, "Dimples");
        deleted = patientListStart.deletePatient(patientNotOnList);
        System.out.println("Deleted patientNotOnList: " + deleted);
        //deleting the first one... by updating pointer AND actually deleting
        System.out.println("Deleting first patient John");
        patientListStart = patientListStart.getNextPatient();
        patientListStart.deletePatient(firstPatient);
        printPatients();
    }

    private void printPatients() {
        Patient printThisPatient = patientListStart;
        Patient nextPatient;
        do {
            System.out.println("NAME: " + printThisPatient.getName() +
                    "\t AGE: " + printThisPatient.getAge() +
                    "\tILLNESS: " + printThisPatient.getIllness() +
                    "\tTHIS: " + printThisPatient +
                    "\tNEXTPATIENT: " + printThisPatient.getNextPatient());
            nextPatient = printThisPatient.getNextPatient();
            printThisPatient = nextPatient;
        } while (nextPatient != patientListStart);
    }
}