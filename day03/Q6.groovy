class Point {
    double x;
    double y;
}


class Rectangle {
    Point upLeft;
    Point downRight;
}


String strX, strY;

// make Up Left Corner
Point upLeftCorner = new Point();
System.out.print("Up Left X: ");
strX = System.console().readLine();
upLeftCorner.x = Double.parseDouble(strX);
System.out.print("Up Left Y: ");
strY = System.console().readLine();
upLeftCorner.y = Double.parseDouble(strY);

// make Down Right Corner
Point downRightCorner = new Point();
System.out.print("Down RightX: ");
strX = System.console().readLine();
downRightCorner.x = Double.parseDouble(strX);
System.out.print("Down Right Y: ");
strY = System.console().readLine();
downRightCorner.y = Double.parseDouble(strY);

// make rectangle
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = upLeftCorner;
myRectangle.downRight = downRightCorner;

// make testPoint
Point testPoint = new Point();
System.out.print("test point X: ");
strX = System.console().readLine();
testPoint.x = Double.parseDouble(strX);
System.out.print("test point Y: ");
strY = System.console().readLine();
testPoint.y = Double.parseDouble(strY);

// see if testpoint inside
boolean insideHorizontal = false;
boolean insideVertical = false;

if (testPoint.x > myRectangle.upLeft.x && testPoint.x < myRectangle.downRight.x) {
    insideHorizontal = true;
}
if (testPoint.y < myRectangle.upLeft.y && testPoint.y > myRectangle.downRight.y) {
    insideVertical = true;
}
if (insideHorizontal && insideVertical) {
    System.out.println("Inside");
} else {
    System.out.println("Outside");
}



