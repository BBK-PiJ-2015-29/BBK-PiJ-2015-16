public class HospitalManager {
    private Patient patientListStart = null;

    public static void main(String[] args) {
        HospitalManager hm = new HospitalManager();
        hm.run();
    }

    public void printReverseDetails() {
        patientListStart.printReverseDetails(patientListStart);
    }

    public void printPatientDetails() {
        patientListStart.printPatientDetails(patientListStart);
    }

    public void run() {
        Patient patient1 = new Patient("John", 33, "ebola");
        patientListStart = patient1;

        Patient patient2 = new Patient("Mary", 56, "flu");
        patientListStart.addPatient(patient2);

        Patient patient3 = new Patient("Alan", 64, "diabetes");
        patientListStart.addPatient(patient3);

        Patient patient4 = new Patient("Jim", 36, "broken arm");
        patientListStart.addPatient(patient4);

        Patient patient5 = new Patient("Rachel", 13, "broken leg");
        patientListStart.addPatient(patient5);

        Patient patient6 = new Patient("Peter", 44, "cold");
        patientListStart.addPatient(patient6);

        Patient patient7 = new Patient("Ana", 25, "asthma");
        patientListStart.addPatient(patient7);

        Patient patient8 = new Patient("Robert", 54, "hypertension");
        patientListStart.addPatient(patient8);

        Patient patient9 = new Patient("Sarah", 31, "cholera");
        patientListStart.addPatient(patient9);

        Patient patient10 = new Patient("Giles", 74, "plague");
        patientListStart.addPatient(patient10);

        printPatientDetails();
        printReverseDetails();
        patientListStart.deletePatient(patient5);
        patientListStart.deletePatient(patient9);
        //Patient endOfList = getListEnd(patientListStart);
        printReverseDetails();
    }
}