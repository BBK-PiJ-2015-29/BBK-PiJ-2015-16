package antiaircraft

Target test = new Target(10);
boolean play = true;
while (play) {
	test.init();
	System.out.println("Here they come! Try to bring the plane down!");
	boolean done = false;
	while (!done) {
		System.out.print("Enter a coordinate X: ");
		int checkX = Integer.parseInt(System.console().readLine());
		System.out.print("Enter a coordinate Y: ");
		int checkY = Integer.parseInt(System.console().readLine());
		System.out.print("Enter a coordinate Z: ");
		int checkZ = Integer.parseInt(System.console().readLine());
		Result checked = test.fire(checkX, checkY, checkZ)
		if (checked == Result.HIT) {
			System.out.println("You hit it! Well done!");
			done = true;
		}
		if (checked == Result.FAIL_LEFT) {
			System.out.println("You missed! The target is to the right!");
		}
		if (checked == Result.FAIL_RIGHT) {
			System.out.println("You missed! The target is to the left!");
		}
		if (checked == Result.FAIL_HIGH) {
			System.out.println("You missed! The target is lower!");
		}
		if (checked == Result.FAIL_LOW) {
			System.out.println("You missed! The target is higher!");
		}
		if (checked == Result.FAIL_SHORT) {
			System.out.println("You missed! The target is farther!");
		}
		if (checked == Result.FAIL_LONG) {
			System.out.println("You missed! The target is nearer!");
		}
		if (checked == Result.OUT_OF_RANGE) {
			System.out.println("That shot is way out of range. Try harder!");
		}
	}
	System.out.println("Would you like to play again? (=y)");
	String str = System.console().readLine();
	if (str != "y"){
		System.out.println("Bye");
		play = false;
	}
}	