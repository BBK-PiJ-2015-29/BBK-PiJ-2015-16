package q3_2;

import java.util.concurrent.Executor;

public class TimedTask implements Runnable {

    private int wait;

    public TimedTask(int wait) {
        if (wait < 1000) {
            this.wait = wait;
        } else {
            this.wait = 1000;
        }
    }

    public static void main(String args[]) {
        System.out.println("Starting");
        Executor me = new MarkExecutor();
        MarkSerialExecutor e = new MarkSerialExecutor(me);
        for (int i = 0; i < 5; i++) {
            Runnable r = new TimedTask(i * 20);
            System.out.println("Max Time is: " + e.getMaxPendingTime());
            e.execute(r);
            System.out.println("Max Time is: " + e.getMaxPendingTime());
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(wait);
        } catch (InterruptedException ex) {
            //do nothing
        }
    }
}

