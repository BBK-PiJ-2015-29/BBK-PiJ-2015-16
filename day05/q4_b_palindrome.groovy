boolean isPalindrome(String str) {
	if (str.length() <= 1) {
	return true;
	} else 
		if (str.charAt(str.length()-1) == str.charAt(0)) {
			return isPalindrome(str.substring(1,str.length()-1));	
		} else {
			return false;
	}		
}	
	



System.out.println("enter word: ");
String str = System.console()readLine();
System.out.println("that's a palindrome...  " + isPalindrome(str));
