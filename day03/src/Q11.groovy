//get input text and its length
System.out.print("Please write a text:");
String inputText = System.console().readLine();
int inputLength = inputText.length();
//loop to: get a letter, count instances in input text and save letter
int i = 0
int j;
int count = 0;
char thisLetter;
String checkedLetters = "";
int checkedLettersLength;
boolean done = false;
while (!done) {
    //get letter and count instances
    System.out.print("Which letter would you like to count now?:");
    char searchLetter = System.console().readLine();
    // repeated letter check HERE...
    checkedLettersLength = checkedLetters.length();
    j = 0;
    while (j < checkedLettersLength) {
        if (searchLetter == checkedLetters.charAt(j)) {
            done = true;
        }
        j++;
    }
    while (i < inputLength) {
        thisLetter = inputText.charAt(i);
        if (thisLetter == searchLetter) {
            count++;
        }
        i++;
    }
    // add letter to string of letters checked
    checkedLetters = checkedLetters + searchLetter;
    // output and reset variables for loop
    if (done) {
        System.out.println("Thank you for your cooperation. Good bye!");
    } else {
        System.out.println("There are " + count + " in your text.");
    }
    count = 0;
    i = 0;
}


