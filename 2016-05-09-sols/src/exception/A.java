package worksheet.exception;
import java.io.IOException;

public class A {
  public static void start() throws IOException, RuntimeException {
    throw new RuntimeException("Not able to Start");
  }

  public static void main(String args[]) {
    try {
      start();
    } catch (Exception ex) {
      ex.printStackTrace();
    } catch (RuntimeException re) {
      re.printStackTrace();
    }
  }
}
