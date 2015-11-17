public class HospitalManagerCount {
	private PatientCount patientListStart = null;

	public static void main (String[] args) {
		HospitalManagerCount hm = new HospitalManagerCount();
		hm.run();
	}

	public void run() {
		PatientCount patient1 = new PatientCount("John", 33, "ebola");
		patientListStart = patient1;

		PatientCount patient2 = new PatientCount("Mary", 56, "flu");
		patientListStart.addPatient(patient2);

		PatientCount patient3 = new PatientCount("Alan", 64, "diabetes");
		patientListStart.addPatient(patient3);

		PatientCount patient4 = new PatientCount("Jim", 36, "broken arm");
		patientListStart.addPatient(patient4);

		PatientCount patient5 = new PatientCount("Rachel", 13, "broken leg");
		patientListStart.addPatient(patient5);

		PatientCount patient6 = new PatientCount("Peter", 44, "cold");
		patientListStart.addPatient(patient6);

		PatientCount patient7 = new PatientCount("Ana", 25, "asthma");
		patientListStart.addPatient(patient7);		

		PatientCount patient8 = new PatientCount("Robert", 54, "hypertension");
		patientListStart.addPatient(patient8);	

		PatientCount patient9 = new PatientCount("Sarah", 31, "cholera");
		patientListStart.addPatient(patient9);	

		PatientCount patient10 = new PatientCount("Giles", 74, "plague");
		patientListStart.addPatient(patient10);	

		patientListStart.deletePatient(patient5);

		patientListStart.printPatientDetails();

		System.out.println("Number of patients: " + patientListStart.getPatientCount(patientListStart));

		
	}
}