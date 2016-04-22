class MyInteger {
	int value;
	
	int getValue() {
		return value;
	}		
	
	void setValue(int i) {
		value = i;
	}	
	
	boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else  {
			return false;
		}	
	}
	
	boolean isOdd() {
		return !isEven();
	}	
	
	void prettyPrint() {
		System.out.println("Petty " + value);
	}
	
	String toString() {
		return Integer.toString(value);
	}	
	
}	

MyInteger i2 = new MyInteger();
print "Enter a number";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is ";
if (i2.isEven()) {
	println "even";
} else if (i2.isOdd()) {
	println "odd";
} else {
	println "undefined!! your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
	println ("you toString() method seems to work fine");
}	
	

