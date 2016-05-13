public class IsReverse {
  public static boolean isReverse(String s1, String s2) {
    if (s1.length() == 0 && s2.length() == 0) {
      return true;
    } else if (s1.length() == 0 || s2.length() == 0) {
      return false;  // not same length
    } else {
      String s1first = s1.substring(0, 1);
      String s2last = s2.substring(s2.length() - 1);
      return s1first.equalsIgnoreCase(s2last) &&
               isReverse(s1.substring(1),
                 s2.substring(0, s2.length() - 1));
    }
  }

  public static boolean isReverseTwo(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;  // not same length
    } else if (s1.length() == 0 && s2.length() == 0) {
      return true;
    } else {
      s1 = s1.toLowerCase();
      s2 = s2.toLowerCase();
      return s1.charAt(0) == s2.charAt(s2.length() - 1) &&
               isReverseTwo(s1.substring(1, s1.length()),
                 s2.substring(0, s2.length() - 1));
    }
  }

  public static boolean isReverseThree(String s1, String s2) {
    if (s1.length() == s2.length()) {
      return isReverse(s1.toLowerCase(), 0,
        s2.toLowerCase(), s2.length() - 1);
    } else {
      return false;   // not same length
    }
  }

  private static boolean isReverse(String s1, int i1,
                                   String s2, int i2) {
    if (i1 >= s1.length() && i2 < 0) {
      return true;
    } else {
      return s1.charAt(i1) == s2.charAt(i2) &&
               isReverse(s1, i1 + 1, s2, i2 - 1);
    }
  }


  public static boolean isReverseFour(String s1, String s2) {
    return reverse(s1.toLowerCase()).equals(s2.toLowerCase());
  }

  private static String reverse(String s) {
    if (s.length() == 0) {
      return s;
    } else {
      return reverse(s.substring(1)) + s.charAt(0);
    }
  }
}
