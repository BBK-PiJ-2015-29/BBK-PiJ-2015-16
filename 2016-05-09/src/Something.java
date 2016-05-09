public class Something {
  public static void something(int n) {
    if (n < 0) {
      System.out.print("-");
      something(-n);
    } else if (n < 10) {
      System.out.println(n);
    } else {
      int two = n % 100;
      System.out.print(two / 10);
      System.out.print(two % 10);
      something(n / 100);
    }
  }

  public static void main(String[] args) {
    something(7);
    something(825);
    something(38947);
    something(612305);
    something(-12345678);
  }
}
