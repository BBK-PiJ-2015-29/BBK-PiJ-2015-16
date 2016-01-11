import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnnotationsTest {
    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.err.println("@BeforeClass: onceExecutedBeforeAll");
    }

    @AfterClass
    public static void onceExecutedAfterAll() {
        System.err.println("@AfterClass: onceExecutedAfterAll");
    }

    @Before
    public void executedBeforeEach() {
        testList = new ArrayList();
        System.err.println("@Before: executedBeforeEach");
    }

    @After
    public void executedAfterEach() {
        testList.clear();
        System.err.println("@After: executedAfterEach");
    }

    @Test
    public void EmptyCollection() {
        assertTrue(testList.isEmpty());
        System.err.println("@Test: EmptyArrayList");

    }

    @Test
    public void OneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.err.println("@Test: OneItemArrayList");
    }

    @Ignore
    public void executionIgnored() {
        System.err.println("@Ignore: This execution is ignored");
    }
}
