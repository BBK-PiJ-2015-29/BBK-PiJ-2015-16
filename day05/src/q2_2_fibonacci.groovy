int fib (int n) {
	if (n < 3) {
		return 1;
	} else {
		int result = fib(n-1) + fib(n-2)
		return result;
	}
}		




//fib 1: 1
//fib 2: 1
//fib 3: fib 2 + fib 1 = 2
//fib 4: fib 3 + fib 2 = 3
//fib 5: fib 4 + fib 3 = 5

//etc..



int get = 45;
System.out.println(fib(get));
/*
int olderFib = 1;
int oldFib = 1;
int i = 3;
while (i <= get) {
	System.out.println("do: newFib = " + oldFib + " + " + olderFib);
	newFib = oldFib + olderFib;	
	olderFib = oldFib;
	oldFib = newFib;

	i++;
}
System.out.println("Fib " + get + " equals " + newFib);
*/