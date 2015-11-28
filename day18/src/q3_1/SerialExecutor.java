package q3_1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class SerialExecutor implements Executor {

    private final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
    private final Executor executor;
    private Runnable active;

    public SerialExecutor(Executor executor) {
        this.executor = executor;
    }


    @Override
    public synchronized void execute(Runnable r) {
        //R1 added to the queue in a wrapper with a run() method that calls R1.run and
        //once done calls scheduleNext() - which executes the next wrapped runnable.
        tasks.offer(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("r.run();");
                    r.run();
                } finally {
                    System.out.println("finally scheduleNext();");
                    scheduleNext();
                }
            }
        });
        //as nothing active run the first one
        if (active == null) {
            System.out.println("active == null, scheduleNext();");
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        active = tasks.poll();
        // if it was the end of the queue, active would be set to null
        if (active != null) {
            executor.execute(active);
        }
    }
}


