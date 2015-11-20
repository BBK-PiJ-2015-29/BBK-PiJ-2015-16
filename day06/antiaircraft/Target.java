package antiaircraft;

public class Target {

	private int[][][] theSpace;
	
	//constructor method
	public Target (int x) {
		theSpace = new int[x][x][x];
	}
	//set theSpace all zeros apart except for one 1	
	private void init()	{
		int x = theSpace.length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < x; k++) {	
					theSpace[i][j][k] = 0;	
				}
			}
		}
		int findX = (int) Math.abs(x * Math.random());
		int findY = (int) Math.abs(x * Math.random());	
		int findZ = (int) Math.abs(x * Math.random());
		theSpace[findX][findY][findZ] = 1;		
		System.out.print("in init method, findX is: " + findX);
		System.out.print(" findY is: " + findY);
		System.out.println(" findZ is: " + findZ);
	}

	private Result fire(int x, int y, int z) {
		if ( x <  0 || x > theSpace.length - 1 || y < 0 || y > theSpace.length - 1 || 
				z < 0 || z > theSpace.length - 1) {
			return Result.OUT_OF_RANGE;
		}
		int xToFind = -1;
		int yToFind = -1;
		int zToFind = -1;
		for (int i = 0; i < theSpace.length; i++) {
			for (int j = 0; j < theSpace.length; j++) {
				for (int k = 0; k < theSpace.length; k++) {			
					if (theSpace[i][j][k] == 1) {
						xToFind = i;
						yToFind = j;
						zToFind = k;
					}
				}
			}
		}
		if( x < xToFind) {
			return Result.FAIL_LEFT;
		}
		if (x > xToFind) {
			return Result.FAIL_RIGHT;
		}
		if (y < yToFind) {
			return Result.FAIL_LOW;
		}
		if (y > yToFind) {
			return Result.FAIL_HIGH;
		}
		if (z < zToFind) {
			return Result.FAIL_SHORT;
		}
		if (z > zToFind) {
			return Result.FAIL_LONG;		
		}		
		return Result.HIT;
	}
}