println("Please input three numbers for sorting");

print("First number: ");
String str1 = System.console().readLine();
int a = Integer.parseInt(str1);

print("First number: ");
String str2 = System.console().readLine();
int b = Integer.parseInt(str2);

print("First number: ");
String str3 = System.console().readLine();
int c = Integer.parseInt(str3);

int min, mid, max;

if (a > b) {
    if (a > c) {
        max = a;
        if (b > c) {
            mid = b;
            min = c;
        } else {
            mid = c;
            min = b;
        }
    } else {
        mid = a;
        if (b > c) {
            max = b;
            min = c;
        } else {
            max = c;
            min = b;
        }
    }
} else {
    if (b > c) {
        max = b;
        if (a > c) {
            mid = a;
            min = c;
        } else {
            mid = c;
            min = a;
        }
    } else {
        mid = b;
        max = c;
        min = a;
    }
}

println("low is: " + min + ", middle is: " + mid + ", highest is: " + max);

