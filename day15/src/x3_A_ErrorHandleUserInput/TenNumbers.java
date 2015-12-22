

public class TenNumbers {


	public static void main(String[] args) {
		TenNumbers tn = new TenNumbers();
		tn.launch();
	}

	public void launch() {
	
		int total = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			String str = System.console().readLine();
			try {
				int p = Integer.parseInt(str);
				total = total + p;	
			} catch (NumberFormatException ex) {
				System.out.println(">> " + str + " is not a number.");
				i--;
			}
		}
		System.out.println("Average is: " + total/10);
	}

}