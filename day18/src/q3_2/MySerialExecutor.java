package q3_2;

import q3_1.SerialExecutor;

import java.util.concurrent.Executor;

public class MySerialExecutor extends SerialExecutor implements Executor {

    public MySerialExecutor(Executor executor) {
        super(executor);
    }

    public int getMaxPendingTime() {
        return tasks.size() * 1000;
    }
}


