

	// start new: move next (1) to empty to B
	
	// move next biggest (2) to empty C
	
	// move littlest (1) onto C (2)
	
	//+++++++++++++++
	
	// start new: move next (3) onto empty B
	
	// repeat everything ending with moving 4 onto an empty..
	
	// 
//n = 		  2               3 	          4
// moves are: 3.. (+ 1 + 3 = )7.. (+1 + 7 = )15... (+1 + 15+)31 


int hanoi(int n) {
	int result;
	if(n > 0) {
		result = 2 * hanoi(n-1) + 1;
	} else {
		return result;
	}
}	

for (n = 1; n <= 30 ; n++) {
System.out.println("for discs " + n + " moves is " + hanoi(n));
}



