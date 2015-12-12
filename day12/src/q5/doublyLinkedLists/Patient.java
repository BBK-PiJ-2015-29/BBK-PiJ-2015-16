package q5.doublyLinkedLists;

public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	//constructor
	public Patient (String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
	
	public Patient () {
		this.nextPatient = null;
		this.previousPatient = null;	
	}
	
	
	// getters
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
	
	public Patient getPreviousPatient() {
		return previousPatient;
	}

	//setter
	public void setPreviousPatient(Patient previousPatient) {
		this.previousPatient = previousPatient;
	}	

	//add a patient to list
	public void addPatient(Patient newPatient) {
		if(this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this; 
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	//delete a patient from list
	public boolean deletePatient(Patient patient) {
	
		if(this.nextPatient == null) {
			//patient to be removed was not found
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			//we found it...it is the next one...	
			//now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
			nextPatient.previousPatient = this;
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);	
		}	
			
	}
}