package q1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testsNormalName() {
        Person p = new Person();
        String input = "Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }
}