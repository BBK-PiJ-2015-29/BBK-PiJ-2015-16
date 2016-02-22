package q3_3;

public class User implements Runnable {

    public static final int WAIT_A_LONG_TIME = 15000;

    private SimpleExecutor taskExecutor;
    private int userID;
    private int timeCanWait;

    public User(SimpleExecutor taskExecutor, int userID, int timeCanWait) {
        this.taskExecutor = taskExecutor;
        this.userID = userID;
        this.timeCanWait = timeCanWait;
    }

    @Override
    public void run() {
        Task task = null;
        int wait;
        for (int taskID = 0; taskID < 100; taskID++) {
            // random time between 0.5 and 7 seconds
            wait = (int) (Math.random() * 6500) + 500;

            System.out.println("Wait = " + taskExecutor.getMaxWaitingTime());

            while (taskExecutor.getMaxWaitingTime() > timeCanWait) {
                System.out.println("User " + userID +
                        ": The site is down! I'll come back later. Current wait " + taskExecutor.getMaxWaitingTime() + " can wait " + timeCanWait);
                try {
                    Thread.sleep(WAIT_A_LONG_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            synchronized (taskExecutor) {
                task = new Task(userID, taskID, wait);
                taskExecutor.execute(task);
            }
            try {
                Thread.sleep(wait);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}


