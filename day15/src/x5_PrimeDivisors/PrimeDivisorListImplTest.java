package x5_PrimeDivisors;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
//import org.junit.Rule;
//import org.junit.rules.ExpectedException;

public class PrimeDivisorListImplTest {
    
	private PrimeDivisorList l;
	
	@Before
	public void setUp() {
		l = new PrimeDivisorListImpl();
	}
	
//	@Rule
//	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testAddAndReturnNormal() {
		Integer i = 7;
		l.add(i);
		Integer expected = 7;
		assertEquals(expected, l.remove());
	}

	@Test (expected = NullPointerException.class) 
	public void testAddNullGetException() {		
		Integer i = null;
		l.add(i);
//		thrown.expect(NullPointerException.class);
//		thrown.expectMessage("No Null in this list - monkey");
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testAddNonPrimeGetException() {		
		Integer i = 10;
		l.add(i);
//		thrown.expect(IllegalArgumentException.class);
//		thrown.expectMessage("monkeys - this bit of test not working...");
	}
	
	@Test
	public void testExampleInExercise() {
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(7);
		String expected = "[ 2 * 3^2 * 7 ]";
		assertEquals(expected, l.toString());
	}	
}
