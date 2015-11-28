//get input

System.out.println ("Text please:");
String str = System.console().readLine();

// pick each letter in turn and print it out

int strLong = str.length();
System.out.println(strLong);
int i = 0;
char thisLetter;
while (i < strLong) {
	thisLetter = str.charAt(i)
	System.out.println(thisLetter);
	i++;
}

	
