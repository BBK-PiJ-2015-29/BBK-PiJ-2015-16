int[] value = new int[5];
String[] suit = new String[5];
String str = "";
int count = 0;
boolean done = false;

//get cards
while (count < 5) {
    valid = false;
    number = false;

    while (!valid) {
        System.out.println("Enter card value (1,2, ... , 9, 10, j, q, k): ");
        str1 = System.console().readLine();
        if (str1 == "j") {
            value[count] = 11;
            done = true;
            valid = true;
        }
        if (str1 == "q") {
            value[count] = 12;
            done = true;
            valid = true;
        }
        if (str1 == "k") {
            value[count] = 13;
            done = true;
            valid = true;
        }
        if (str1 == "10") {
            value[count] = 10;
            done = true;
            valid = true;
        }
        if (str1 == "1" || str1 == "2" || str1 == "3" || str1 == "4" || str1 == "5" ||
                str1 == "6" || str1 == "7" || str1 == "8" || str1 == "9" || str1 == "10") {
            number = true;
        }
        if (!done && number) {
            value[count] = Integer.parseInt(str1);
            valid = true;
        }
    }
    boolean ok = false;
    while (!ok) {
        System.out.println("Enter card suit (c,d,h,s): ");
        str2 = System.console().readLine();
        if (str2 == "c" || str2 == "d" || str2 == "h" || str2 == "s") {
            suit[count] = str2;
            ok = true;
        }
    }

    // check not duplicate and then confirm
    boolean dupl = false;
    c = 0;
    while (c < 5) {
        if (value[count] == value[c] && suit[count] == suit[c] && count != c) {
            dupl = true;
            System.out.println("DUPLICATE!!!!!!!@");
        }
        c++;
    }
    if (!dupl) {
        System.out.println("U added: " + value[count] + " of " + suit[count]);
        count++;
    }
    done = false;
}

// check if all 5 are same suit
count = 1;
boolean flush = true;
while (count < 5) {
    if (suit[count] != suit[count - 1]) {
        flush = false;
    }
    count++;
}

// get how many of each value
int[] got = new int[13];
int check = 1;
while (check < 14) {
    got[check - 1] = 0;
    count = 0;

    while (count < 5) {
        if (check == value[count]) {
            got[check - 1]++;
        }
        count++;
    }
    check++;
}

// how many pairs, triples and quads and do we have a consec set? 
int pair = 0;
int triple = 0;
int quad = 0;
int straight = 0;
boolean consec = false;
count = 1;
while (count < 14) {
    if (got[count - 1] == 2) {
        pair++;
    }
    if (got[count - 1] == 3) {
        triple++;
    }
    if (got[count - 1] == 4) {
        quad++;
    }
    if (got[count - 1] == 1) {
        straight++;
        if (straight == 5) {
            consec = true;
        }
    } else {
        straight = 0;
    }
    count++;
}

//output best hand

if (consec && flush) {
    System.out.println("STRAIGHT FLUSH");
} else if (quad == 1) {
    System.out.println("POKER");
} else if (triple == 1 && pair == 1) {
    System.out.println("FULL HOUSE");
} else if (flush) {
    System.out.println("FLUSH");
} else if (consec) {
    System.out.println("STRAIGHT");
} else if (triple == 1) {
    System.out.println("THREE OF A KIND");
} else if (pair == 2) {
    System.out.println("TWO PAIR");
} else if (pair == 1) {
    System.out.println("PAIR");
} else
    System.out.println("NOTHING");

