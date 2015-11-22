int binary2decimal(String binInput) {
    int i = binInput.length();
    String str;
    int v;
    int decOutput = 0;
    for (j = 0; j < i; j++) {
        str = binInput.charAt(j);
        v = Integer.parseInt(str);
        decOutput = decOutput + v * Math.pow(2, i - j - 1);
    }
    return decOutput;
}

String decimal2binary(int decInput) {
    int remainder;
    String binOutput = "";

    while (decInput >= 0.5) {
        remainder = decInput % 2;
        decInput = decInput / 2;
        binOutput = Integer.toString(remainder) + binOutput;
    }
    return binOutput;
}

String getMenuChoice() {
    while (true) {
        System.out.println("Enter b for binary to decimal, d for decimal to binary");
        System.out.print(">>> ");
        String str = System.console().readLine();
        if (str == "b" || str == "d") {
            return str;
        } else {
            System.out.println("not valid");
        }
    }
}

String getBinInput() {
    System.out.println("Enter a binary number");
    System.out.print(">>> ");
    String str = System.console().readLine();
    return str;
}

int getDecInput() {
    System.out.println("Enter a decimal number");
    System.out.print(">>> ");
    String str = System.console().readLine();
    int dec = Integer.parseInt(str);
    return dec;
}


String str = getMenuChoice();
if (str == "b") {
    String binInput = getBinInput();
    int decOutput = binary2decimal(binInput);
    System.out.println("You entered the binary number: " + binInput);
    System.out.println("which is: " + decOutput + " in decimal");

} else {
    int decInput = getDecInput();
    String binOutput = decimal2binary(decInput);
    System.out.println("You entered the decimal number: " + decInput);
    System.out.println("which is: " + binOutput + " in binary");
}	
