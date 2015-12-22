import java.util.Calendar;

public class Patient {

	private String name;
	private int yearOfBirth;
	private Patient nextPatient;
	
	private Patient head;
	
	public Patient (String name, int yearOfBirth) {
		this.name = name;
		this.nextPatient = null;
		int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
		System.out.println("Trying to add " + name + " of age: " + age);
		if (age < 0 || age > 130) {
			throw new IllegalArgumentException("Age Must be Between 0 & 130");
		} else {
			this.yearOfBirth = yearOfBirth;
		}	
	}
	
	public Patient() {
		this.head = this;
		this.nextPatient = null;
	}
	
	public void add(String name, int yearOfBirth) {
		Patient runner = head;
		while (runner.nextPatient != null) {
			runner = runner.nextPatient;
		}
		runner.nextPatient = new Patient(name, yearOfBirth);
	}
}	