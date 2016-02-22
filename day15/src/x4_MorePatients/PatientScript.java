public class PatientScript {

	public static void main(String[] args) {
		PatientScript ps = new PatientScript();
		ps.launch();
	}
	
	public void launch() {
		Patient m = new Patient();
		m.add("Mark", 2000);
		m.add("John", 1800);
	}	
}	