package q3_3;

public class SimpleExecutorImpl implements SimpleExecutor {

    private TaskManager manager;

    public SimpleExecutorImpl() {
        this.manager = new TaskManager();
        Thread t = new Thread(manager);
        t.start();
    }

    @Override
    public void execute(Runnable task) {
        manager.add(task);
    }

    @Override
    public int getMaxWaitingTime() {
        return manager.getMaxWaitingTime();
    }

}

