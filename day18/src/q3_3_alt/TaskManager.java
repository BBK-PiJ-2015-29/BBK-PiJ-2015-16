package q3_3_alt;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TaskManager implements Runnable {

	int maxThreads;
	int currentThreads;
	BlockingQueue<Runnable> commands ;

	public TaskManager (int maxThreads, int maxQueueSize)
	{
		commands = new ArrayBlockingQueue(maxQueueSize);
		this.maxThreads = maxThreads;
	}
	

	@Override
	public void run() {
		//sleep once hit max
		// lower count once run and then wake it.
		
	}

	
	
}
