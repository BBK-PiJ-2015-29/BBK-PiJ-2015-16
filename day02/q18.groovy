print("what would you like n to be: ");
String str = System.console().readLine();
int n = Integer.parseInt(str);
double p = 0;
int k = 0;
int sign = 1;
println()
while (k < n) {

    p = p + ((4 * sign) / ((2 * k) + 1))
    System.out.println("when n is: " + (k + 1) + " pi is: " + p);
    sign = sign * -1
    k++;
    if (Math.abs(p - 3.14) < 10E-10) {
        break;
    }
}
println("It took " + n + " terms");