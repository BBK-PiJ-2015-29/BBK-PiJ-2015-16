public class Point3D extends Point implements Comparable<Point3D> {
  private int z;

  public Point3D() {
    this(0, 0, 0);
  }

  public Point3D(int x, int y, int z) {
    setLocation(x, y, z);
  }

  public int getZ() {
    return z;
  }

  public String toString() {
    return "(" + getX() + ", " + getY() + ", " + z + ")";
  }

  public void setLocation(int x, int y) {
    setLocation(x, y, 0);
  }

  public void setLocation(int x, int y, int z) {
    super.setLocation(x, y);
    this.z = z;
  }

  public double distanceFromOrigin() {
    return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
  }

  public int compareTo(Point3D other) {
    if (getX() != other.getX()) {
      return getX() - other.getX();
    } else if (getY() != other.getY()) {
      return getY() - other.getY();
    } else {
      return z - other.z;
    }
  }
}
