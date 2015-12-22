import java.util.ArrayList;
import java.util.List;

public class Except {


	public static void main(String[] args) {
		Except e = new Except();
		e.launch();
	}

	public void launch() {
	
		List<Integer> list = new ArrayList<Integer>();	

		try {

			int newElement = 99;		
//			String newElement = "word";

			list.add(newElement);
			list.add(null);

//			int result = list.get(1);

			int result2 = list.get(77);		
		
		
//		} catch (Exception ex) {
//			System.out.println("Exception Hi");
//			ex.printStackTrace();
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Hi");
			ex.printStackTrace();
//		} catch (IndexOutOfBoundsException ex) {
//			System.out.println("Index OOBE Hi");
//			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception Hi");
			ex.printStackTrace();
		}		
		
	}


}