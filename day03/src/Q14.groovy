//get input text and its length
System.out.print("Please write a text:");
String inputText = System.console().readLine();
int inputLength = inputText.length();

//print forwards
System.out.print(inputText);

//print backwards
int i = 0;
while (i < inputLength) {

    backLetter = inputText.charAt(inputLength - i - 1);
    System.out.print(backLetter);
    i++;
}
System.out.println();
