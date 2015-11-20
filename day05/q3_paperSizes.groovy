// number of times to grow (if positive) or shrink (if negative)
int getMultipleOfAZero(String str) {
	int result = 0;
	for (int n = 1 ; n < str.length(); n++) {
		if (str.charAt(n) == '0') {
			result++;
		}
	}
	if (str.charAt(1) != '0') {	
	result = - Integer.parseInt(str.substring(1,str.length()));	
	}		
	return result;
}
// grow if A0, A00, A000 etc... 
int growWidth(int multiple) {
	if (multiple == 1) {
		return 841;
	}
	int stretch;
	if (multiple % 2 == 0) {
		stretch = 2;
	} else {
		stretch = 1;		
	} 
	return stretch * growWidth(multiple -1);
}

int growLength(int multiple) {
	if (multiple == 1) {
		return 1189;
	}
	int stretch;
	if (multiple % 2 == 0) {
		stretch = 1;
	} else {
		stretch = 2;		
	} 
	return stretch * growLength(multiple -1);
}
// shrink for if A1, A2, A3 etc. 
int shrinkWidth(int multiple) {
	if (multiple == 1) {
		return 841;
	}
	double stretch;
	if (multiple % 2 == 0) {
		stretch = 0.5;
	} else {
		stretch = 1;		
	} 
	return stretch * shrinkWidth(multiple -1);
}

int shrinkLength(int multiple) {
	if (multiple == 0) {
		return 1189;
	}
	double stretch;
	if (multiple % 2 == 0) {
		stretch = 1;
	} else {
		stretch = 0.5;		
	} 
	return stretch * shrinkLength(multiple -1);
}


System.out.println("Enter size required: ");
String sizeRequired = System.console().readLine();
multiple = getMultipleOfAZero(sizeRequired);
// grow if multiple positive
if (multiple > 0) {
	System.out.println("grown width is: " + growWidth(multiple));
}
if (multiple < 0) {
	System.out.println("shrunk width is: " + shrinkWidth(-multiple));
}	
// shrink if multiple is negative
if (multiple > 0) {
	System.out.println("grown length is: " + growLength(multiple));
}
if (multiple < 0) {
	System.out.println("shrunk length is: " + shrinkLength(-multiple));
}