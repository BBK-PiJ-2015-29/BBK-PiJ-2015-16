public class PatientCount {
	private String name;
	private int age;
	private String condition;
	private PatientCount nextPatient;
	private static int patientCount = 0;

	public PatientCount(String name, int age, String condition) {
		this.name = name;
		this.age = age;
		this.condition = condition;
		this.nextPatient = null;
	}

	public void addPatient(PatientCount newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	public boolean deletePatient(PatientCount patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}

	public static int getPatientCount(PatientCount patient) {
		if (patient.nextPatient == null) {
			return patientCount;
		} else {
			patientCount++;
			return patient.nextPatient.getPatientCount(patient.nextPatient);
		}
	} 

	public boolean printPatientDetails() {
		System.out.print("Patient name: " + this.name +"\n");
		System.out.print("Age: " + this.age +"\n");
		System.out.print("Condition: " + this.condition +"\n");

		if (nextPatient == null){
			System.out.print("No next patient in list. \n");
			return true;

		} else {
			System.out.print("Next patient in list: " + this.nextPatient.name +"\n");
			return this.nextPatient.printPatientDetails();
		}
		
	}

}