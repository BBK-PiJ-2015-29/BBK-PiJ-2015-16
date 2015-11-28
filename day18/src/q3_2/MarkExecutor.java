package q3_2;

import java.util.concurrent.Executor;

public class MarkExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }
}

