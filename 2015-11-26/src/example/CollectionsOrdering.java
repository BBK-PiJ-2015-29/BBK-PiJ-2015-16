// Demonstrates behaviour that requires classes to implement the Comparable interface.

import java.util.*;

public class CollectionsOrdering {
   public static void main(String[] args) {
      testStringOrdering();
      testPointOrdering();

   }

   // Builds a List of Strings and calls several methods that require Strings
   // to have a natural ordering.
   public static void testStringOrdering() {
      String[] tempNames = { "Tyler", "Kurt", "Martin", "Mikey", "Tristan" };
      List<String> names = Arrays.asList(tempNames);

      System.out.println(names);

      Collections.sort(names);
      System.out.println(names);
      System.out.println(Collections.binarySearch(names, "Mikey"));
   }

   // Builds a List of Points and calls several methods that require Points
   // to have a natural ordering.
   public static void testPointOrdering() {
      Point[] tempPoints = { new Point(8, 12), new Point(3, 17),
            new Point(3, 16), new Point(7, 5), new Point(-7, -1) };
      List<Point> points = Arrays.asList(tempPoints);

      System.out.println(points);

      Collections.sort(points);
      System.out.println(points);
      System.out.println(Collections.binarySearch(points, new Point(8, 6)));
   }

}
