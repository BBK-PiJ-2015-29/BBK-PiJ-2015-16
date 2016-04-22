package q3_3_alt;

import java.util.concurrent.BlockingQueue;

public class ExecutorImplThread implements Runnable{

	int threadNum;
	BlockingQueue<Runnable> queue;
	boolean running;
	Runnable currentCommand;
	
	public ExecutorImplThread(int num, BlockingQueue<Runnable> taskQueue)
	{
		threadNum = num;
		queue = taskQueue;
		running = true;
		System.out.println("Thread " + threadNum + " created.");
	}
	
	@Override
	public void run() {
		
		while(running)
		{
			try {
				currentCommand = queue.take();
				System.out.println("Thread " + threadNum + " starting to run program " + ((WaitSecs)currentCommand).runNum);
				currentCommand.run();
			} catch (InterruptedException e) {
				if (!running) System.out.println("Thread " + threadNum + " stopped.");
				else System.out.println("Thread " + threadNum + "interupted.");
			}
		}		
	}
	
	public void stopRunning(){running = false;}

}
