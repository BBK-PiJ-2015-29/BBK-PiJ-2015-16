//get input

System.out.println("Text please:");
String str = System.console().readLine();
System.out.println("Which letter to look for:");
char lookLetter = System.console().readLine();

System.out.println("look for:" + lookLetter);

// pick each letter in turn and print it out

int strLong = str.length();
int i = 0;
int count = 0;
char thisLetter;
while (i < strLong) {
    thisLetter = str.charAt(i)
    if (thisLetter == lookLetter) {
        count++;
    }
    i++;
}
System.out.println("There are:" + count + " " + lookLetter + "s");

	
