import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calc calc;

    @Before
    public void setup() {
        calc = new CalcImpl();
    }

    @Test
    public void test() {
        int x = 3;
        int y = 4;
        assertEquals(x * y, calc.multiply(x, y));
    }

    @Test
    public void testMinus() {
        int x = -3;
        int y = -4;
        assertEquals(x * y, calc.multiply(x, y));
    }

    @Test
    public void testMinusAndPostive() {
        int x = -3;
        int y = 4;
        assertEquals(x * y, calc.multiply(x, y));
    }

}