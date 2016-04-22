package q7a;

public class SelfSortingListTest {

	public static void main(String[] args) {
	
		SelfSortingListTest ssls = new SelfSortingListTest();
		ssls.launch();
	
	}

	public void launch() {
		
		SelfSortingList ssl = new SelfSortingList();
	
		ssl.add(90);
		ssl.add(20);
		ssl.add(40);
		ssl.add(10);
		ssl.add(80);
		ssl.add(60);
		ssl.add(70);
		ssl.printList();
		
		boolean done = false;
		while(!done) {
		
			System.out.println("Enter(or q) - or f for fifth: ");
			String str = System.console().readLine();
			System.out.println();
			if(str.equals("f")) {
				System.out.print("getting fifth");
				int fifth = ssl.get(5);
				System.out.println("fifth is: " + fifth);
			}	else {
				if(!str.equals("q")) {
					int i = Integer.parseInt(str);
					ssl.add(i);
				} else {
					done = true;
					ssl.setStop(true);
				}
			}
		}			
	}
}	



