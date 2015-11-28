package q3_2;

import java.util.concurrent.Executor;

public class MarkSerialExecutor extends SerialExecutor implements Executor {

    public MarkSerialExecutor(Executor executor) {
        super(executor);
    }

    public int getMaxPendingTime() {
        return tasks.size() * 1000;
    }
}


