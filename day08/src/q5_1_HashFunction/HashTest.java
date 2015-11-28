package q5_1_HashFunction;

public class HashTest {

	public static void main(String[] args) {
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("Big Hash: " + hash);
		System.out.println("0 < " + smallHash + " < 1000");	
	}
	
}

