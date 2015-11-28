int factorial (int n) {
	if (n==1) {
		return 1;
	} else {
		int result = n * factorial(n-1);
		return result;
	}
}		


int n = 8;
System.out.println(factorial(n));
if (n == 1) {
	System.out.println("1");
} else {
	int x = 2;
	int t = 1;
		while (x <= n ) {
			t = t * (x);	
			x++;
		}
	System.out.println(t);
}		

