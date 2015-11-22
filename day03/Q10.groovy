//get input
System.out.println("Short text to look for please:");
String shortText = System.console().readLine();
System.out.println("long text to look in please:");
String longText = System.console().readLine();
//get length of the inputs
int shortTextLength = shortText.length();
int longTextLength = longText.length();
//find each instance of first letter of short and then check off following letters
int i = 0;
int count = 0;
int j = 1;
boolean match = true;
char thisLetter;

while (i <= (longTextLength - shortTextLength)) {
    thisLetter = longText.charAt(i)
    if (thisLetter == shortText.charAt(0)) {
        while (j < shortTextLength) {
            if (longText.charAt(i + j) != shortText.charAt(j)) {
                match = false;
            }
            j++;
        }
        if (match) {
            count++;
        }
        j = 1;
    }
    match = true;
    i++;
}
// output
System.out.println(shortText + " was found " + count + " time(s)");