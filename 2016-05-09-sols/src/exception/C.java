package worksheet.exception;
import java.io.IOException;

public class C {
  public static void start() {
    System.out.println("Java Exception test");
  }

  public static void main(String args[]) {
    try {
      start();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}
