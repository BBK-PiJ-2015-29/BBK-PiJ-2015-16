package circularlists;

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    // accessors

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    // mutators

    public void setNextPatient(Patient nextPatient) {
        this.nextPatient = nextPatient;
    }

    //add a patient to list

    public void addPatient(Patient newPatient) {
        boolean done = false;
        Patient currentPatient = this;
        while (!done) {
            if (currentPatient.nextPatient == this) {
                currentPatient.nextPatient = newPatient;
                newPatient.nextPatient = this;
                done = true;
            } else {
                currentPatient = currentPatient.nextPatient;
            }
        }
    }

    // delete patient

    public boolean deletePatient(Patient patient) {
        boolean done = false;
        Patient currentPatient = this;

        while (!done) {
            if (currentPatient.nextPatient.name.equals(patient.name)) {
                // the next one is the one to delete --- to complete
                currentPatient.nextPatient = patient.nextPatient;
                return true;
            } else {
                currentPatient = currentPatient.nextPatient;
                if (currentPatient.nextPatient == this) {
                    //been around once
                    return false;
                }
                currentPatient = currentPatient.nextPatient;
            }
        }
        //there was a problem ...
        return false;
    }
}	