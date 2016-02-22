package q3_3_alt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {
    static int runNum = 1;
    int threadNum;
    BlockingQueue<Runnable> queue;
    List<Thread> threads = new ArrayList<Thread>();
    List<ExecutorImplThread> scripts = new ArrayList<>();

    public ExecutorImpl(int threadNum, int maxQueueSize) {

        queue = new ArrayBlockingQueue<>(maxQueueSize);
        ExecutorImplThread tempThread;

        for (int i = 1; i <= threadNum; i++) {
            tempThread = new ExecutorImplThread(i, queue);
            scripts.add(tempThread);
            threads.add(new Thread(tempThread));
        }

        for (Thread t : threads) t.start();
    }

    public static void main(String[] args) {
        ExecutorImpl ex = new ExecutorImpl(2, 5);

        ex.execute(new WaitSecs(1, 1));
        ex.execute(new WaitSecs(2, 2));
        ex.execute(new WaitSecs(3, 1));
        ex.execute(new WaitSecs(4, 2));
        ex.execute(new WaitSecs(5, 3));
        ex.execute(new WaitSecs(6, 1));
        ex.execute(new WaitSecs(7, 1));

        ex.stopAll();
    }

    @Override
    public void execute(Runnable command) {
        System.out.println("Adding command " + ((WaitSecs) command).runNum);
        runNum++;
        try {
            synchronized (queue) {
                System.out.println("Attemping to add " + ((WaitSecs) command).runNum + " to queue.");
                queue.put(command);
                queue.notifyAll();
            }
        } catch (InterruptedException e) {
            execute(command);
        }
    }

    public void stopAll() {
        synchronized (queue) {
            for (ExecutorImplThread t : scripts) t.stopRunning();
            queue.notifyAll();
        }
    }
}

