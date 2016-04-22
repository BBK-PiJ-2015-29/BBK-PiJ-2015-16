int i = 1;
int j;
print "How many lines would you like: ";
String s = System.console().readLine();
int numLines = Integer.parseInt(s);

while (i <= numLines) {
    j = 1;
    while (j <= i) {
        print i;
        j++;
    }
    println()
    i++;
}	
