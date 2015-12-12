package q3;

public class Person {

    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != 0) {
                String nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();
            }
        }
        return result;
    }

/* old method & main for manual testing

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getInitials("     Mark   Aidan Kingsbury"));;
		
	}

	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}	
		return result;
	}

*/


}