package mock;

public class TowerImpl implements Tower {
    // instance variables
    private final double xc, yc;        // center of cell tower range
    private final double range;         // radius of cell tower range

    // constructor
    // Tower centered at (x, y), radius of range r
    public TowerImpl(double x, double y, double r) {
        xc = x;
        yc = y;
        range = r;
    }

    // test main.  Not a required part of the exam.
    public static void main(String[] args) {
        // set up cell tower at origin, unit range
        Tower test = new TowerImpl(0.0, 0.0, 1.0);
        System.out.println(test.inRange(.707, .707));   // should be true
        System.out.println(test.inRange(.707, .708));   // should be false
    }

    // is point in range of this tower?
    @Override
    public boolean inRange(double x0, double y0) {
        // distance between (x0, y0) and cell tower
        double dx = xc - x0;
        double dy = yc - y0;
        double dist = Math.sqrt(dx * dx + dy * dy);

        // is it in range?
        return (dist < range);
    }

    // return x coordinate
    @Override
    public double getX() {
        return xc;
    }

    // return y coordinate
    @Override
    public double getY() {
        return yc;
    }

    // return radius of tower range
    @Override
    public double getR() {
        return range;
    }
}
