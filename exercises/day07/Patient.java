public class Patient {
    private String name;
    private int age;
    private String condition;
    private Patient prevPatient;
    private Patient nextPatient;

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.prevPatient = null;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient) {
        //if last in the list
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            newPatient.prevPatient = this;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if (this.nextPatient == null) {
            return false;
        } else if (this.nextPatient.name.equals(patient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            nextPatient.prevPatient = this;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public void printPatientDetails(Patient p) {
        if (p.nextPatient == null) {
            System.out.println(p + "\n");
        } else {
            System.out.println(p);
            printPatientDetails(p.nextPatient);

        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.condition;
    }

    public void printReverseDetails(Patient p) {
        if (p.nextPatient == null) {
            System.out.println(p);
        } else {
            printReverseDetails(p.nextPatient);
            System.out.println(p);
        }
    }

}