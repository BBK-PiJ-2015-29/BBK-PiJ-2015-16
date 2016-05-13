package worksheet.exception;
import java.io.IOException;

public class B {
  public class SuperClass {
    public void start() throws IOException {
      throw new IOException("Not able to open file");
    }
  }

  public class SubClass extends SuperClass {
    public void start() throws Exception {
      throw new Exception("Not able to start");
    }
  }
}
