package threadingtest;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ConcurrentTestRunner.class)
public class TestCounter {

	private final Counter counter = new Counter();

	@Test
	public void testAdd() {
		counter.addOne();
	}
}