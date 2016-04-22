public class AverageNumbers {

	public static void main(String[] args) {
		AverageNumbers an = new AverageNumbers();
		an.launch();
	}

	public void launch() {
		System.out.println("How many numbers would you like to average?");	
			int n = getInteger();
		double total = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Input number: ");
			int p = getInteger();
			total = total + p;		
		}
		System.out.println("Average is: " + total/n);
	}
	
	public int getInteger() {
		
		boolean done = false;
		int result = 0;
		while (!done) {
			String str = System.console().readLine();
			try {
				result = Integer.parseInt(str);
				done = true;
			} catch (NumberFormatException ex) {
				System.out.print(">> " + str + " is not a number. Enter number:");
			}
		}
		return result;
	}
		
}	