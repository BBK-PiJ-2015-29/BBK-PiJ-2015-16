package creatingmatrices

//make a new matrix and fill with ones
Matrix test = new Matrix();
test.Matrix(5,3);
System.out.println();
System.out.println("A 5 x 3 matrix filled with ones");
test.prettyPrint();
// set one of the cells to 8
System.out.println("set 1,2 in the matrix to 8");
test.setElement(1,2,8);
test.prettyPrint();
//trying out setRow
String str = "91,92,93";
System.out.println("set row 3 to 91,92,93");
test.setRow(3,str);
test.prettyPrint();
System.out.println("get a new blank 6 x 3 matrix");
Matrix test2 = new Matrix();
test2.Matrix(6,3);
test2.prettyPrint();
System.out.println("set row 3 to 91,92,93");
test2.setRow(3,str);
test2.prettyPrint();
System.out.println("try to set row 1 to 91,92,93,94 - nothing happens");
str = "91,92,93,94";
test2.setRow(1,str);
test2.prettyPrint();
System.out.println("try to set row 1 to 91,X,92,93 - nothing happens");
str = "91,X,92,93";
test2.setRow(1,str);
test2.prettyPrint();
System.out.println("try to set row 1 to 91,92,93, - nothing happens");
str = "91,92,93,";
test2.setRow(1,str);
test2.prettyPrint();
System.out.println("try to set row 1 to 91,92 - nothing happens");
str = "91,92";
test2.setRow(1,str);
test2.prettyPrint();
System.out.println("try to set row 1 to an empty string - nothing happens");
str = "";
test2.setRow(1,str);
test2.prettyPrint();
// trying out setColumn
System.out.println("get a new blank 5 x 6 matrix");
Matrix test3 = new Matrix();
test3.Matrix(5,6);
test3.prettyPrint();
System.out.println("set column 1 to 51,52,53,54,55");
str = "51,52,53,54,55";
test3.setColumn(1,str);
test3.prettyPrint();
System.out.println("set column 4 to 51,52,53,54 - nothing happens");
str = "51,52,53,54";
test3.setColumn(4,str);
test3.prettyPrint();
//trying toAString
String strOut = test3.toAString();
System.out.println("As a string: " + strOut);
System.out.println("END");

