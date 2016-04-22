package q5

class Point {
    double x;
    double y;
}


class Rectangle {
    q4.Point upLeft;
    q4.Point downRight;
}


String strX, strY;

// make Up Left Corner
q4.Point upLeftCorner = new q4.Point();
System.out.print("Up Left X: ");
strX = System.console().readLine();
upLeftCorner.x = Double.parseDouble(strX);
System.out.print("Up Left Y: ");
strY = System.console().readLine();
upLeftCorner.y = Double.parseDouble(strY);

// make Down Right Corner
q4.Point downRightCorner = new q4.Point();
System.out.print("Down RightX: ");
strX = System.console().readLine();
downRightCorner.x = Double.parseDouble(strX);
System.out.print("Down Right Y: ");
strY = System.console().readLine();
downRightCorner.y = Double.parseDouble(strY);

Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = upLeftCorner;
myRectangle.downRight = downRightCorner;


double horizontalLength = myRectangle.downRight.x - myRectangle.upLeft.x;
double verticalLength = myRectangle.upLeft.y - myRectangle.downRight.y;

System.out.println("Perimeter: " + 2 * (horizontalLength + verticalLength));
System.out.println("Area     : " + horizontalLength * verticalLength);



