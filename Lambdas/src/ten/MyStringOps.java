package ten;

//This class defines a static method called strReverse(). 
public class MyStringOps {
	// A static method that reverses a string.
	public static String strReverse(String str) {
		String result = "";
		int i;

		for (i = str.length() - 1; i >= 0; i--)
			result += str.charAt(i);

		return result;
	}
}