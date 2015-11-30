package q3_1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;


public class SerialExecutor implements Executor {

    protected final Queue<Runnable> tasks = new ArrayDeque<>();
    private final Executor executor;
    private Runnable active;

    public SerialExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public synchronized void execute(final Runnable r) {
        tasks.offer(new Runnable() {
            @Override
            public void run() {
                try {
                    r.run();
                } finally {
                    scheduleNext();
                }
            }
        });

        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        active = tasks.poll();
        if (active != null) {
            executor.execute(active);
        }
    }
}




