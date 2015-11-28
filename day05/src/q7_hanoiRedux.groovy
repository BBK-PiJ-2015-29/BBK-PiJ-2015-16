/*
NH(3) means do the normal hanoi (solution from ex 2c) with n = 3 (and so on...)

Then to swap 2 towers of 3 discs each....

NH(1) + 1 + NH(2) + 1 + NH(3) + 1 + NH(5) + 1 + NH (3) + 1 + NH(2) + 1 + NH (1)

which is...

1     + 1 +   3  +  1   + 7    +1   + 31   +1    +7    + 1    + 3  + 1   + 1

= 59

simplifying:

[NH(1)+1] + [NH(2)+1] + [NH(3)+1] + NH(5) + [1+NH(3)] + [1+pNH(2)] + [1+NH (1)]

[2*NH(1)+2] + [2*NH(2)+2] + [2*(NH(3)+2] + one x NH(5)

so sum NH up to n-3 [i.e. for n=6... go up to 3] double and + 2 
and then add NH(n-1) [i.e. for n= 6 do NH(5)]
*/



int hanoi(int n) {
	int result;
	if(n > 0) {
		result = 2 * hanoi(n-1) + 1;
	} else {
		return result;
	}
}	

//iteratively first...
int hanoiRedux(int n) {
	int result = 0;
	for (i = 1; i <= n- 3; i++) {
		result = result + 2 * hanoi(i) + 2;
	}
	result += hanoi(n-1);
	return result;	
}


for (n = 1; n <= 10 ; n++) {
	System.out.println("Normal hanoi discs " + n + " is moves " + hanoi(n));
}

for (n=4; n <= 20 ; n = n + 2) {
	System.out.println("Redux discs " + n + " (i.e. two piles of " + n/2 + ") is moves " + hanoiRedux(n));
}
