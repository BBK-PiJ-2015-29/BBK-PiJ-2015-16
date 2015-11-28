int hexadecimal2decimal(String hexInput) {
    int i = hexInput.length();
    String str;
    int power;
    int hexOutput = 0;
    for (j = 0; j < i; j++) {
        str = hexInput.charAt(j);
        hexOutput = hexOutput + getDecSingle(str) * Math.pow(16, i - j - 1);
    }
    return hexOutput;
}

String decimal2hexadecimal(int decInput) {
    int remainderDec;
    String hexOutput = "";
    while (decInput >= 0.5) {
        remainderDec = decInput % 16;
        decInput = decInput / 16;
        hexOutput = getHexSingle(remainderDec) + hexOutput;
    }
    return hexOutput;
}

// very "brute force" - could check value and then convert below 10 but...
int getDecSingle(String hex) {
    int dec;
    if (hex == "0") {
        dec = 0;
    } else if (hex == "1") {
        dec = 1;
    } else if (hex == "2") {
        dec = 2;
    } else if (hex == "3") {
        dec = 3;
    } else if (hex == "4") {
        dec = 4;
    } else if (hex == "5") {
        dec = 5;
    } else if (hex == "6") {
        dec = 6;
    } else if (hex == "7") {
        dec = 7;
    } else if (hex == "8") {
        dec = 8;
    } else if (hex == "9") {
        dec = 9;
    } else if (hex == "a") {
        dec = 10;
    } else if (hex == "b") {
        dec = 11;
    } else if (hex == "c") {
        dec = 12;
    } else if (hex == "d") {
        dec = 13;
    } else if (hex == "e") {
        dec = 14;
    } else if (hex == "f") {
        dec = 15;
    }
    return dec;
}

String getHexSingle(int remainderDec) {
    String remainderHex;
    if (remainderDec <= 9) {
        remainderHex = Integer.toString(remainderDec);
    } else if (remainderDec == 10) {
        remainderHex = "a";
    } else if (remainderDec == 11) {
        remainderHex = "b";
    } else if (remainderDec == 12) {
        remainderHex = "c";
    } else if (remainderDec == 13) {
        remainderHex = "d";
    } else if (remainderDec == 14) {
        remainderHex = "e";
    } else if (remainderDec == 15) {
        remainderHex = "f";
    }
    return remainderHex;
}

System.out.println("Enter the number (hex starts with 0x (zero-x) - no caps pls: ");
String str = System.console().readLine();
if (str.length() > 2 && str.charAt(0) == '0' && str.charAt(1) == 'x') {
    String hexInput = str.substring(2, str.length());
    System.out.println("Your hex as dec = " + hexadecimal2decimal(hexInput));
} else {
    int decInput = Integer.parseInt(str);
    System.out.println("Your dec as hex = " + decimal2hexadecimal(decInput));
}	
