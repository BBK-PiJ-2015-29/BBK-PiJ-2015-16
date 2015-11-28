package q3_3;

import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {

    private static final int MAX_THREADS = 10;
    private static final int TOTAL_TASKS_TO_COMPLETE = 400;
    private static int maxWaitingTime;
    private Queue<Runnable> taskQueue;
    private boolean running;
    private Thread[] threadPool;
    private int taskCount;


    public TaskManager() {
        this.taskQueue = new LinkedList<Runnable>();
        threadPool = new Thread[MAX_THREADS];
        for (int i = 0; i < MAX_THREADS; i++) {
            threadPool[i] = null;
        }
        this.running = true;
        this.taskCount = 0;
        this.maxWaitingTime = 0;
    }


    public int getMaxWaitingTime() {
        return maxWaitingTime;
    }

    public void add(Runnable task) {
        if (running) {
            synchronized (taskQueue) {
                this.taskQueue.offer(task);
                Task temptask = (Task) task;
                maxWaitingTime = maxWaitingTime + temptask.getWait();
            }
        } else {
            throw new RuntimeException("Cannot add tasks to a stopped manager");
        }
    }

    @Override
    public synchronized void run() {
        threadPool = new Thread[MAX_THREADS];
        while (running) {
            while (!taskQueue.isEmpty()) {
                int nextThreadAvailable = findAvailableThread();
                if (nextThreadAvailable != -1 && !taskQueue.isEmpty()) {
                    Runnable next = taskQueue.poll();
                    launchTask(next, nextThreadAvailable);
                }
            }
            if (taskCount >= TOTAL_TASKS_TO_COMPLETE) {
                running = false;
            }
        }
        System.out.println("Task Manager thread finished - taskCount = " + taskCount);
    }

    private synchronized int findAvailableThread() {
        for (int i = 0; i < MAX_THREADS; i++) {
            if (threadPool[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private synchronized void launchTask(Runnable task, int id) {
        WrappedTask wrappedTask = new WrappedTask(task, id, this);
        Thread t = new Thread(wrappedTask);
        this.threadPool[id] = t;
        t.start();
    }


    private class WrappedTask implements Runnable {

        private Runnable myTask;
        private int threadId;
        private TaskManager taskManager;

        public WrappedTask(Runnable task, int threadId, TaskManager taskManager) {
            this.myTask = task;
            this.threadId = threadId;
            this.taskManager = taskManager;
        }

        @Override
        public synchronized void run() {
            try {
                myTask.run();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            taskManager.taskCount++;
            taskManager.threadPool[threadId] = null;
            Task task = (Task) myTask;
            taskManager.maxWaitingTime = taskManager.maxWaitingTime - task.getWait();
            System.out.println("End > " + taskManager.maxWaitingTime);
        }
    }
}