void printNumbers(int n) {
	if (n <= 0) {
							//println("return");
		return;
	}
							//println("XX1");
	println(n);
							//println("pN " + (n-2));
	printNumbers(n-2);
							//println("pN " + (n-3));
	printNumbers(n-3);
							//println("XX2");
	println(n);
}

printNumbers(6);
