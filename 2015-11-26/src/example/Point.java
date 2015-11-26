// Points represent positions in 2D space.
// demonstrates using the Comparable<E> interface and implementing a compareTo method

package example;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    // Create a Point a the given position.
    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    // Create a Point representing the origin.
    public Point() {
        x = 0;
        y = 0;
    }

    // compares this point to another first using the x value
    // and then using the y value. Returns a negative number if this point
    // has a smaller x (or smaller y if the xs are equal), a positive number
    // if this point has a bigger x (or bigger y if the xs are equal) and
    // 0 otherwise.
    public int compareTo(Point other) {
        if (x != other.x) {
            return x - other.x;
        } else {
            return y - other.y; // same x; break ties with y.
        }
    }

    // Moves x and y coordinates of this point by specified amounts
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Changes the location of this Point.
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    // Returns this point's x coordinate.
    public int getX() {
        return x;
    }

    // setters
    public void setX(int newX) {
        if (newX > 0) {
            x = newX;
        }
    }

    // Returns this point's y coordinate.
    public int getY() {
        return y;
    }

    // Returns the distance of this Point from the origin.
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns the distance between this Point and another Point.
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Returns this Point's coordinates surrounded by parentheses
    // and separated by a comma.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
