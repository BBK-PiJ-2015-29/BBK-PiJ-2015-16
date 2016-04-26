package threadingtest;

public class ThreadStart extends Thread {
	private int i = 0;

	public static void main(String[] args) {
		ThreadStart threadStart = new ThreadStart();
		threadStart.i = 8;

		threadStart.start();

	}

	@Override
	public void run() {
		int j = i;
	}
}