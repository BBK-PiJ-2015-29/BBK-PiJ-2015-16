package q3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person p;

    @Before
    public void startup() {
        p = new Person();
    }

    @Test
    public void testsNormalName() {
        String output = p.getInitials("Jo Robert John");
        assertEquals(output, "DRY");
    }

    @Test
    public void testsOneExtraSpaceMiddleName() {
        String output = p.getInitials("Jo  Robert John");
        assertEquals(output, "DRY");
    }

    @Test
    public void testsManyExtraSpaceMiddleName() {
        String output = p.getInitials("Jo      Robert John");
        assertEquals(output, "DRY");
    }

    @Test
    public void testsExtraSpaceAtFrontName() {
        String output = p.getInitials("     Jo Robert John");
        assertEquals(output, "DRY");
    }
}