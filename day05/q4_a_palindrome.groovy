// only works for odd length words

boolean isPalindrome(String str, int p) {
	int middle = str.length()/2;
	if ((middle - p) > 0) {
		if (str.charAt(middle-p) == str.charAt(middle+p)) {
			result = true;
			result = isPalindrome(str, p+1);			
		} else {
			return false;
		}
	} else {
		return result;
	}
}	

System.out.print("Enter string: ");
String str = System.console()readLine();


// could make work for even length ones by sticking an x in the middle of it.



boolean test = isPalindrome(str, 0);

if (test) {
	System.out.println("That's a palindrome");
	} else {
	System.out.println("That's NOT a palindrome");
}
		



