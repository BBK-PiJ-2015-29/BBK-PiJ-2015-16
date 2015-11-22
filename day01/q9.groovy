System.out.println("Input an arbitrarily long sequence of positive numbers ending with -1")

// This should be a do..while loop but groovy doesn't have such a construct

String insequence = "Yes"

print("Number: ")
String str = System.console().readLine();
int i  = Integer.parseInt(str);
int j

while (i != -1) {
    print("Number: ")
	str = System.console().readLine();
	j = Integer.parseInt(str);

	if (j != -1) {
        if (i + 1 != j)
            insequence = "No"
    }
    i = j
}

System.out.println(insequence);
