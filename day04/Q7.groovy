double calcTotalToPay(double borrowed, double atRate) {
    double totalToPay = borrowed * (1 + (atRate / 100));
    //System.out.println("in the method total to pay is: " + totalToPay);
    return totalToPay;
}

double calcPayEveryYear(double borrowed, double years, double atRate) {
    double total = calcTotalToPay(borrowed, atRate);
    double yp = total / years;
    //System.out.println("yearly payment in method is: " + yp);
    return yp;
}

double calcYearsOfInterest(double borrowed, double years, double atRate) {
    double total = calcTotalToPay(borrowed, atRate);
    double interest = total - borrowed;
    //System.out.println("interest is: " + interest);
    double yearlyPayment = calcPayEveryYear(borrowed, years, atRate);
    //System.out.println("your yearly payment is " + yearlyPayment);
    double yearsOfInterest = interest / yearlyPayment;
    //System.out.println("interest is paid in: " + yearsOfInterest + " years");
    return yearsOfInterest;
}

System.out.print("Total to borrow:");
String str = System.console().readLine();
double borrow = Double.parseDouble(str);
System.out.print("Number of years:");
str = System.console().readLine();
double years = Double.parseDouble(str);
System.out.print("Interest rate:");
str = System.console().readLine();
double rate = Double.parseDouble(str);

double total = calcTotalToPay(borrow, rate);
System.out.println("Total to pay is: " + total);

double yearlyPayment = calcPayEveryYear(borrow, years, rate);
System.out.println("Yearly payment is: " + yearlyPayment);

double yearsOfInterest = calcYearsOfInterest(borrow, years, rate);
System.out.println("After " + yearsOfInterest + " years, only the capital remains.");
