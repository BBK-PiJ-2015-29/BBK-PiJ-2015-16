package q5_3_HashTable;

public class SimpleMapTwoTest {


	public static void main(String[] args) {
		SimpleMapTwoTest smtt = new SimpleMapTwoTest();
		smtt.launch();	
	}

	public void launch() {
		SimpleMapTwoImpl smti = new SimpleMapTwoImpl();
		
		//add names
		boolean quit = false;
		String name;
		int hash, verySmallHash;
		System.out.println("Enter names (q for quit): ");
		while(!quit) {
			System.out.print("> ");	
			name = System.console().readLine();
			if(!name.equals("q")) {
				hash = name.hashCode();
				verySmallHash = HashUtilities.veryShortHash(hash);
				smti.put(verySmallHash, name);
			} else {
				quit = true;
			}	
		}	
		//get and print names
		System.out.println("===PRINTING HASH TABLE=== ");
		for (int key = 0; key < 10; key++) {
			String[] result;
			result = smti.get(key);
			System.out.print("KEY: " + key);
			for (int i = 0; i < result.length; i++) {
				System.out.print(" > " + result[i]);
			}				
			System.out.println();
		}
		//remove a name
		boolean done = false;
		System.out.println("Enter name to remove (q for quit)");
		while(!done) {
			System.out.print(">");
			name = System.console().readLine();
			if (!name.equals("q")) {
				hash = name.hashCode();
				verySmallHash = HashUtilities.veryShortHash(hash);
				smti.remove(verySmallHash, name);
			} else {
				done = true;
			}	
		}


		//get and print names
		System.out.println("===PRINTING HASH TABLE=== ");
		for (int key = 0; key < 10; key++) {
			String[] result;
			result = smti.get(key);
			System.out.print("KEY: " + key);
			for (int i = 0; i < result.length; i++) {
				System.out.print(" > " + result[i]);
			}				
			System.out.println();
		}
		
		//check if table is empty
		boolean emptyTable = smti.isEmpty();
		if (emptyTable) {
			System.out.println("The table is empty");
		}	else {
			System.out.println("The table is NOT empty");
		}

	}




}