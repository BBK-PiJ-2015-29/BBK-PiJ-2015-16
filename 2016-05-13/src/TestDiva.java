import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDiva {
  @Test
  public void divaNull(){
    Diva d = new Diva();
    Diva d2 = null;
    assertFalse(d.equals(d2));
    assertTrue(d.equals(d2));
    //d2.equals(d);
  }
}
