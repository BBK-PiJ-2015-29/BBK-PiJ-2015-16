package q3_3_alt;

public class WaitSecs implements Runnable {

    int runNum, waitSec;

    public WaitSecs(int runNum, int waitSec) {
        this.runNum = runNum;
        this.waitSec = waitSec;
    }

    @Override
    public void run() {
        System.out.println("Program " + runNum + " is starting to run.");

        try {
            Thread.sleep(waitSec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		/*
		long startTime = System.nanoTime();

		while ((System.nanoTime() - (waitSec * 1000000000) ) < startTime)
		{
			try {
				Thread.sleep((waitSec * 1000000000) + startTime - System.nanoTime());
			} catch (InterruptedException e) {
				System.out.println("Wait program " + runNum + "interupted and will continue.");
			} catch (IllegalMonitorStateException e)
			{
				System.out.println("Not sure why this is being thrown");
			}
		}*/

        System.out.println("Program " + runNum + " has completed having run for " + waitSec + " seconds.");
    }

}
