class Point {
    double x;
    double y;

    double distanceTo(Point p) {
        double distance = Math.pow((Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)), 0.5);
        return distance;
    }

    double distanceToOrigin() {
        Point origin = new Point();
        origin.x = 0;
        origin.y = 0;
        double distance = distanceTo(origin);
        return distance;
    }

    void moveTo(double a, double b) {
        this.x = a;
        this.y = b;
        return;
    }

    void moveTo(Point p) {
        this.x = p.x;
        this.y = p.y;
        return;
    }

    Point clone() {
        Point p = new Point();
        p.x = x;
        p.y = y;
        return p;
    }

    Point opposite() {
        Point p = new Point();
        p.x = -x;
        p.y = -y;
        return p;
    }
}

Point first = new Point();
first.x = 3.0;
first.y = 4.0;
Point another = new Point();
another.x = 2.0;
another.y = 3.0;
Point given = new Point();
given.x = 20;
given.y = 30;


System.out.println("First point is: " + first.x + ", " + first.y);
System.out.println("Another point is: " + another.x + ", " + another.y);
System.out.println("======");
System.out.println("From the first point...");
System.out.println("...distance to another point is: " + first.distanceTo(another));
System.out.println("...distance to origin point is: " + first.distanceToOrigin());
System.out.println("======");
System.out.println("Now we use moveTo(5,10) to move this point to 5,10...");
first.moveTo(5.0, 10.0);
System.out.println("First point is: " + first.x + ", " + first.y);
System.out.println("Another point is: " + another.x + ", " + another.y);
System.out.println("======");
System.out.println("Given point is: " + given.x + ", " + given.y);
System.out.println("Now change this point(first) to move to the given point...");
first.moveTo(given);
System.out.println("First point is: " + first.x + ", " + first.y);
System.out.println("======");
System.out.println("Now clone() that point to build the point zpt");
zpt = first.clone();
System.out.println("zpt point is: " + zpt.x + ", " + zpt.y);
System.out.println("======");
System.out.println("and then return a copy of current point zpt * -1");
zptMinus = zpt.opposite();
System.out.println("zptMinus  is: " + zptMinus.x + ", " + zptMinus.y);

