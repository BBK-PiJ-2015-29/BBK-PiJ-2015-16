package queuelength;

public class HospitalManager {

    private Patient patientListStart = null;

    public static void main(String[] args) {
        HospitalManager hm = new HospitalManager();
        hm.launch();
    }

    private void launch() {

        Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        patientListStart = firstPatient;

        Patient secondPatient = new Patient("Mary", 66, "Meningitis");
        patientListStart.addPatient(secondPatient);
        Patient thirdPatient = new Patient("Sophia", 16, "Headache");
        patientListStart.addPatient(thirdPatient);
        Patient anotherPatient = new Patient("Jane", 26, "Broken leg");
        patientListStart.addPatient(anotherPatient);
        Patient anotherPatientTwo = new Patient("Tom", 16, "Shoulder");
        patientListStart.addPatient(anotherPatientTwo);
        Patient patient6 = new Patient("Cathy", 48, "Ears");
        patientListStart.addPatient(patient6);
        Patient patient7 = new Patient("Clark", 34, "Weight");
        patientListStart.addPatient(patient7);
        Patient patient8 = new Patient("Jim", 84, "Knees");
        patientListStart.addPatient(patient8);
        Patient patient9 = new Patient("Benny", 98, "Cold");
        patientListStart.addPatient(patient9);
        Patient patient10 = new Patient("Debs", 77, "Cat");
        patientListStart.addPatient(patient10);

        printPatients();

        // check how long the list is
        int countRecursive = countPatientsRecursive(patientListStart);
        int countIterative = countPatientsIteratively();
        System.out.println("There are: " + countRecursive + " patients (recursively)");
        System.out.println("There are: " + countIterative + " patients (iteratively)");


        boolean deleted;
        deleted = patientListStart.deletePatient(patient8);
        System.out.println("Jim deleted: " + deleted);
        printPatients();
        deleted = patientListStart.deletePatient(anotherPatient);
        System.out.println("Jane deleted: " + deleted);
        printPatients();

        // now try and delete first one by point patientListStart at one along chain...
        System.out.println("Deleting first patient John, by updating pointer");
        patientListStart = patientListStart.getNextPatient();
        printPatients();

        // check how long the list is
        countRecursive = countPatientsRecursive(patientListStart);
        countIterative = countPatientsIteratively();
        System.out.println("There are: " + countRecursive + " patients (recursively)");
        System.out.println("There are: " + countIterative + " patients (iteratively)");
    }

    private int countPatientsRecursive(Patient patient) {
        int result = 1;
        if (patient.getNextPatient() == null) {
            return result;
        } else {
            result = 1 + countPatientsRecursive(patient.getNextPatient());
        }
        return result;
    }

    private int countPatientsIteratively() {
        int result = 0;
        Patient nextPatient = patientListStart;
        do {
            result++;
            nextPatient = nextPatient.getNextPatient();
        } while (nextPatient != null);
        return result;
    }


    private void printPatients() {
        Patient printThisPatient = patientListStart;
        Patient nextPatient;
        do {
            System.out.println("NAME: " + printThisPatient.getName() +
                    "\t AGE: " + printThisPatient.getAge() +
                    "\tILLNESS: " + printThisPatient.getIllness());
            nextPatient = printThisPatient.getNextPatient();
            printThisPatient = nextPatient;
        } while (nextPatient != null);
    }

}










