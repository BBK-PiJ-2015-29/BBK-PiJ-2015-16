package q4

class Point {
    double x;
    double y;
}

String strX, strY;

// make firstPoint
Point firstPoint = new Point();
System.out.print("X: ");
strX = System.console().readLine();
firstPoint.x = Double.parseDouble(strX);
System.out.print("Y: ");
strY = System.console().readLine();
firstPoint.y = Double.parseDouble(strY);

// make secondPoint
Point secondPoint = new Point();
System.out.print("X: ");
strX = System.console().readLine();
secondPoint.x = Double.parseDouble(strX);
System.out.print("Y: ");
strY = System.console().readLine();
secondPoint.y = Double.parseDouble(strY);

// make thirdPoint
Point thirdPoint = new Point();
System.out.print("X: ");
strX = System.console().readLine();
thirdPoint.x = Double.parseDouble(strX);
System.out.print("Y: ");
strY = System.console().readLine();
thirdPoint.y = Double.parseDouble(strY);

// calculate distance between first and second points

double distanceFirstSecond = Math.pow(Math.pow((firstPoint.x - secondPoint.x), 2) + Math.pow((firstPoint.y - secondPoint.y), 2), 0.5);
double distanceFirstThird = Math.pow(Math.pow((firstPoint.x - thirdPoint.x), 2) + Math.pow((firstPoint.y - thirdPoint.y), 2), 0.5);
double distanceSecondThird = Math.pow(Math.pow((thirdPoint.x - secondPoint.x), 2) + Math.pow((thirdPoint.y - secondPoint.y), 2), 0.5);

if (distanceFirstSecond < distanceSecondThird && distanceFirstSecond < distanceFirstThird) {
    System.out.println("First and Second are nearest");
} else if (distanceSecondThird < distanceFirstSecond && distanceSecondThird < distanceFirstThird) {
    System.out.println("Second and Third are nearest");
} else
    System.out.println("First and Third are nearest");
