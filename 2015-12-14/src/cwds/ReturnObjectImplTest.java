package cwds;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReturnObjectImplTest {
    ReturnObject ro;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHasError() throws Exception {

    }

    @Test
    public void testGetError() throws Exception {
        ro = new ReturnObjectImpl(3);
        assertTrue((ro.getError()).equals(ErrorMessage.NO_ERROR));
    }

    @Test
    public void testGetErrorShould() throws Exception {
        // has error
        ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        assertTrue((ro.getError()).equals(ErrorMessage.INVALID_ARGUMENT));
    }

    @Test
    public void testGetReturnValue() throws Exception {

    }
}