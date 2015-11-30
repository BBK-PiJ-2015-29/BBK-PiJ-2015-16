package q3_3_alt;

public class ThreadHolder implements Runnable {

	Thread threadManager;
	Runnable command;

	
	public ThreadHolder(Thread tm, Runnable command)
	{
		threadManager = tm;
		this.command = command;
	}
	
	@Override
	public void run() {
		command.run();
	//	threadManager.lowerCount();
		notify();
		
	}


}
