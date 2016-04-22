package symmetry

//making int[] in MatrixChecker as groovy doesn't seem to like
// this code: "int[] rowToTest = {1, 2, 3, 2, 1};"
MatrixChecker checker1 = new MatrixChecker();
rowToTest = checker1.makeRow();
//test that row for symmetry
boolean symRow = checker1.isSymmetrical(rowToTest);
System.out.println("ROW - The claim of symmetry is: " + symRow);

// make SYMMETRICAL matrix to test
//	1	2	3	4
//	2	1	5	6
//	3	5	1	7
//	4	6	7	8

int[][] myMatrix;
myMatrix = new int[4][4];
myMatrix[0][0] = 1;
myMatrix[0][1] = 2;
myMatrix[0][2] = 3;
myMatrix[0][3] = 4;

myMatrix[1][0] = 2;
myMatrix[1][1] = 1;
myMatrix[1][2] = 5;
myMatrix[1][3] = 6;

myMatrix[2][0] = 3;
myMatrix[2][1] = 5;
myMatrix[2][2] = 1;
myMatrix[2][3] = 7;

myMatrix[3][0] = 4;
myMatrix[3][1] = 6;
myMatrix[3][2] = 7;
myMatrix[3][3] = 8;

// test that matrix for symmetry
boolean symArray = checker1.isSymmetrical(myMatrix);
System.out.println("ARRAY - The claim of symmetry is: " + symArray);

//make TRIANGULAR matrix to test
myMatrix[0][0] = 1;
myMatrix[0][1] = 2;
myMatrix[0][2] = 3;
myMatrix[0][3] = 4;

myMatrix[1][0] = 0;
myMatrix[1][1] = 2;
myMatrix[1][2] = 5;
myMatrix[1][3] = 6;

myMatrix[2][0] = 0;
myMatrix[2][1] = 0;
myMatrix[2][2] = 1;
myMatrix[2][3] = 7;

myMatrix[3][0] = 0;
myMatrix[3][1] = 0;
myMatrix[3][2] = 0;
myMatrix[3][3] = 8;

// test that matrix for triangular
boolean triArray = checker1.isTriangular(myMatrix);
System.out.println("ARRAY - The claim of triangular is: " + triArray);

//make a matrix using Matrix
Matrix bigTest = new Matrix();
String str = "1,2,3,4;2,1,5,6;3,5,1,7;4,6,7,8";
bigTest.setMatrix(str);
bigTest.prettyPrint();
boolean symBig = bigTest.checkSymmetrical();
boolean triBig = bigTest.checkTriangular();
System.out.println("using checkSymmetrical is: " + symBig);
System.out.println("using checkTriangular is: " + triBig);
System.out.println();
//try with a triangular matrix
str = "1,2,3,4;0,2,5,6;0,0,1,7;0,0,0,8";
bigTest.setMatrix(str);
bigTest.prettyPrint();
symBig = bigTest.checkSymmetrical();
triBig = bigTest.checkTriangular();
System.out.println("using checkSymmetrical is: " + symBig);
System.out.println("using checkTriangular is: " + triBig);
System.out.println();
//try with a not either  matrix
str = "1,2,3,4;0,2,5,6;7,0,1,7;0,99,0,8";
bigTest.setMatrix(str);
bigTest.prettyPrint();
symBig = bigTest.checkSymmetrical();
triBig = bigTest.checkTriangular();
System.out.println("using checkSymmetrical is: " + symBig);
System.out.println("using checkTriangular is: " + triBig);
System.out.println();



