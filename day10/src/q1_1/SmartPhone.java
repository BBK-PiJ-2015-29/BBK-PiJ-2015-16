package q11;

public class SmartPhone extends MobilePhone {

		public void browseWeb(String page) {
			System.out.println("BROWSE (from SmartPhone): " + page);
		}
		
		
		public String findPosition() {
			return "You are in London (from SmartPhone)";
		}	
		
			
}