package q4_1_stacktests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class PointerStringStackTest {

    StringStack ss;

    @Before
    public void setUp() {
        ss = new PointerStringStack();
    }

    @Test
    public void testsPushThreeStringsThenPopOne() {
        ss.push("Marvin");
        ss.push("Anna");
        ss.push("Elizabeth");
        assertEquals("Elizabeth", ss.pop());
    }

    @Test
    public void testsPushThreeStringsThenPopTwo() {
        ss.push("Marvin");
        ss.push("Anna");
        ss.push("Elizabeth");
        assertEquals("Elizabeth", ss.pop());
        assertEquals("Anna", ss.pop());
    }

    @Test
    public void testsPushOneStringsThenPopTop() {
        ss.push("Marvin");
        assertEquals("Marvin", ss.pop());
    }

    @Test
    public void testsPopAnEmptyStack() {
        assertNull(ss.pop());
    }

    @Test
    public void testsPushOnePopItThenPopThatEmptyStack() {
        ss.push("Marvin");
        assertEquals("Marvin", ss.pop());
        assertNull(ss.pop());
    }

    @Test
    public void testsPushThreeStringsThenPeekOne() {
        ss.push("Marvin");
        ss.push("Anna");
        ss.push("Elizabeth");
        assertEquals("Elizabeth", ss.peek());
    }


    @Test
    public void testsPushThreeStringsThenPeekTwice() {
        ss.push("Marvin");
        ss.push("Anna");
        ss.push("Elizabeth");
        assertEquals("Elizabeth", ss.peek());
        assertEquals("Elizabeth", ss.peek());
    }

    @Test
    public void testsPushOneStringsThenPeekTop() {
        ss.push("Marvin");
        assertEquals("Marvin", ss.peek());
    }

    @Test
    public void testsPeekAnEmptyStack() {
        assertNull(ss.peek());
    }

    @Test
    public void testsIsEmptyOnEmptyStack() {
        assertTrue(ss.isEmpty());
    }

    @Test
    public void testsIsEmptyOnNotEmptyStack() {
        ss.push("Marvin");
        assertFalse("Not empty stack so isEmpty() should be false", ss.isEmpty());
    }
}

