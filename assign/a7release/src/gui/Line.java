package gui;

import graph.GraphElement;
import graph.Vector;

import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;

/**
 * This graphics class allows the drawing of lines.
 * Lines use a (c1, c2) coordinate system, where c1 and c2 are circle objects
 * that denote the endpoints of this line.
 * Each circle has (x, y) coordinates, so a Line can be though of as having
 * (x1, y1, x2, y2).
 * Each Line is tied to a BoardElement (most likely an Edge) that it represents.
 */

public class Line extends JPanel {
    /**
     * Default thickness of lines when they are drawn on the GUI
     */
    public static final int LINE_THICKNESS = 2;
    /**
     * Number of pixels of tolerance for a point to be considered on the line
     */
    public static final int ON_LINE_TOLERANCE = 20;
    private static final long serialVersionUID = -1688624827819736589L;
    private Circle c1;  //Endpoint one of this line
    private Circle c2;  //Endpoint two of this line
    private Color color; //The color to draw this line; should stay in sync with the color policy
    private GraphElement represents; //The BoardElement (probably Edge) that this represents

    /**
     * Constructor: a line from c1 to c2 representing r and colored black.
     */
    public Line(Circle c1, Circle c2, GraphElement r) {
        setC1(c1);
        setC2(c2);
        represents = r;
        setOpaque(false);
        fixBounds();
    }

    /**
     * Return the x coordinate of the first end of this line.
     */
    public int getX1() {
        return c1.getX1();
    }

    /**
     * Return the y coordinate of the first end of this line.
     */
    public int getY1() {
        return c1.getY1();
    }

    /**
     * Return the x coordinate of the second end of this line.
     */
    public int getX2() {
        return c2.getX1();
    }

    /**
     * Return the y coordinate of the second end of this line.
     */
    public int getY2() {
        return c2.getY1();
    }

    /**
     * Return the midpoint of this line.
     */
    public Point getMid() {
        return new Point(getXMid(), getYMid());
    }

    /**
     * Return the x value of the midpoint of this line.
     */
    public int getXMid() {
        return (c1.getX1() + c2.getX1()) / 2;
    }

    /**
     * Return the y value of the midpoint of this line.
     */
    public int getYMid() {
        return (c1.getY1() + c2.getY1()) / 2;
    }

    /**
     * Return the width (x diff) of the line. Always positive.
     */
    public int getLineWidth() {
        return Math.abs(getX1() - getX2());
    }

    /**
     * Return the height (y diff) of the line. Always positive.
     */
    public int getLineHeight() {
        return Math.abs(getY1() - getY2());
    }

    /**
     * Resize the drawing boundaries of this line based on the
     * height and width of the line, with a minimum sized box of (40,40).
     * Call whenever circles move to fix the drawing boundaries of this.
     */
    public void fixBounds() {
        int minX = Math.min(getX1(), getX2());
        int minY = Math.min(getY1(), getY2());
        int width = Math.max(Math.abs(getX1() - getX2()), 40);
        int height = Math.max(Math.abs(getY1() - getY2()), 40);

        setBounds(minX, minY, width + 2, height + 2);
    }

    /**
     * Return true iff Point p is within ON_LINE_TOLERANCE pixels of this line.
     */
    public boolean isOnLine(Point p) {
        double dist = distanceTo(p);
        return dist <= (double) ON_LINE_TOLERANCE;
    }

    /**
     * Return the distance from p to this line.
     */
    public double distanceTo(Point p) {
        return Line2D.ptLineDist(c1.getX1(), c1.getY1(), c2.getX1(), c2.getY1(), p.getX(), p.getY());
    }

    /**
     * Return the angle between this line and line l, in radians.
     * Return is in the range 0 .. PI.
     * Throw an illegalArgumentException the two lines don't share an endpoint.
     */
    public double radAngle(Line l) throws IllegalArgumentException {
        Circle commonEndpoint;
        Circle otherPoint1;
        Circle otherPoint2;
        if (c1.locationEquals(l.c1)) {
            commonEndpoint = c1;
            otherPoint1 = c2;
            otherPoint2 = l.c2;
        } else if (c1.locationEquals(l.c2)) {
            commonEndpoint = c1;
            otherPoint1 = c2;
            otherPoint2 = l.c1;
        } else if (c2.locationEquals(l.c1)) {
            commonEndpoint = c2;
            otherPoint1 = c1;
            otherPoint2 = c2;
        } else if (c2.locationEquals(l.c2)) {
            commonEndpoint = c2;
            otherPoint1 = c1;
            otherPoint2 = l.c1;
        } else {
            throw new IllegalArgumentException("Can't measure angle between " + this + " and " + l
                    + " because they don't share an endpoint");
        }

        Vector v = new Vector(otherPoint1.getX1() - commonEndpoint.getX1(),
                otherPoint1.getY1() - commonEndpoint.getY1());
        Vector v2 = new Vector(otherPoint2.getX1() - commonEndpoint.getX1(),
                otherPoint2.getY1() - commonEndpoint.getY1());
        return Vector.radAngle(v, v2);
    }

    /**
     * Return true iff l intersects this line.
     * (Return false if they share an endpoint.)
     */
    public boolean intersects(Line l) {
        return !c1.locationEquals(l.getC1()) && !c1.locationEquals(l.getC2()) &&
                !c2.locationEquals(l.getC1()) && !c2.locationEquals(l.getC2()) &&
                Line2D.linesIntersect(c1.getX1(), c1.getY1(), c2.getX1(), c2.getY1(),
                        l.getX1(), l.getY1(), l.getX2(), l.getY2());
    }

    /**
     * Paint this line
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(LINE_THICKNESS));
        Line2D line2d = null;
        if (getX1() < getX2() && getY1() < getY2() || getX2() < getX1() && getY2() < getY1())
            line2d = new Line2D.Double(1, 1, getLineWidth(), getLineHeight());
        else
            line2d = new Line2D.Double(1, getLineHeight(), getLineWidth(), 1);
        g2d.setColor(getColor());
        g2d.draw(line2d);
        g2d.drawString(represents.getMappedName(), represents.getRelativeX(), represents.getRelativeY());
    }


    /**
     * Return the size of the line, as a rectangular bounding box (x2 - x1, y2 - y1).
     */
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Math.abs(getX2() - getX1()), Math.abs(getY2() - getY1()));
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Line)) return false;
        final Line other = (Line) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$c1 = this.c1;
        final Object other$c1 = other.c1;
        if (this$c1 == null ? other$c1 != null : !this$c1.equals(other$c1)) return false;
        final Object this$c2 = this.c2;
        final Object other$c2 = other.c2;
        if (this$c2 == null ? other$c2 != null : !this$c2.equals(other$c2)) return false;
        final Object this$color = this.color;
        final Object other$color = other.color;
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        final Object this$represents = this.represents;
        final Object other$represents = other.represents;
        if (this$represents == null ? other$represents != null : !this$represents.equals(other$represents))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $c1 = this.c1;
        result = result * PRIME + ($c1 == null ? 0 : $c1.hashCode());
        final Object $c2 = this.c2;
        result = result * PRIME + ($c2 == null ? 0 : $c2.hashCode());
        final Object $color = this.color;
        result = result * PRIME + ($color == null ? 0 : $color.hashCode());
        final Object $represents = this.represents;
        result = result * PRIME + ($represents == null ? 0 : $represents.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Line;
    }

    public String toString() {
        return "gui.Line(c1=" + this.c1 + ", c2=" + this.c2 + ", color=" + this.color + ", represents=" + this.represents + ")";
    }

    public Circle getC1() {
        return this.c1;
    }

    protected void setC1(Circle c1) {
        this.c1 = c1;
    }

    public Circle getC2() {
        return this.c2;
    }

    protected void setC2(Circle c2) {
        this.c2 = c2;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected GraphElement getRepresents() {
        return this.represents;
    }

    public void setRepresents(GraphElement represents) {
        this.represents = represents;
    }
}
