//get input number and its length as a string
System.out.println();
System.out.print("Please enter a number:");
String inputText = System.console().readLine();
int inputLength = inputText.length();
//get the whole number, the first decimal and remaining decimals
String newWholeText = "";
String newDecText = "";
boolean wholeNum = false;
boolean first = false;
int i = 0;

while (i < inputText.length()) {
    if (inputText.charAt(i) == '.') {
        wholeNum = true;
    } else {
        if (inputText.charAt(i) != ',' && !wholeNum) {
            newWholeText = newWholeText + inputText.charAt(i);
        }
    }
    if (wholeNum && inputText.charAt(i) != '.') {
        newDecText = newDecText + inputText.charAt(i);
    }

    i++;
}
//parse strings to integers
int whole = Integer.parseInt(newWholeText);
if (newDecText == "") {
    newDecText = "0"
}
int dec = Integer.parseInt(newDecText);

//do halving of the decimal, giving a trailing zero for the 'carry'
dec = dec * 10;
dec = dec / 2;
if (whole % 2 == 1) {
    dec = dec + 5 * Math.pow(10, newDecText.length());
}
//remove those/any trailing zeros from the decimal
while (true) {
    if (dec % 10 == 0 && dec != 0) {
        dec = dec / 10;
    } else {
        break;
    }
}
// get buffer zeros to print before the decimal (only needed when whole is even)
int buffer = 0;
if (whole % 2 == 0) {
    if (newDecText.charAt(0) == '1') {
        buffer++;
    }
    k = 0;
    while (k < newDecText.length()) {
        if (newDecText.charAt(k) == '0') {
            buffer++;
        } else {
            break;
        }
        k++;
    }
    k = 0;
    while (k <= newDecText.length() - 1) {
        if (newDecText.charAt(k) == '0' && newDecText.charAt(k + 1) == '1') {
            buffer++;
            break;
        }
        if (newDecText.charAt(k) != '0') {
            break;
        }
        k++;
    }
}

//halve the whole
whole = whole / 2;

//get the bits between the commas and put back (could embed this in the
// output section to get rif of the Integer.toString() as was trying to avoid!

int a = whole;
String str = "";
int k = 1000;
int part;
String triple;
while (a > 0) {
    part = (a % k / (k / 1000));
    triple = Integer.toString(part);
    if (triple.length() == 1) {
        triple = "00" + triple;
    }
    if (triple.length() == 2) {
        triple = "0" + triple;
    }
    if (k == 1000) {
        str = triple + str;
    } else {
        str = triple + "," + str;
    }
    a = a - a % k;
    k = k * 1000;
}

//output
System.out.print("Out:  ");
boolean clearZero = false;
for (int z = 0; z < str.length(); z++) {
    if (str.charAt(z) != '0') {
        clearZero = true;
    }
    if (clearZero) {
        System.out.print(str.charAt(z));
    }
}

if (dec != 0) {
    System.out.print(".");
}
for (z = 0; z < buffer; z++) {
    if (dec != 0) {
        System.out.print("0");
    }
}
if (dec != 0) {
    System.out.println(dec);
} else {
    System.out.println();
}
System.out.println();