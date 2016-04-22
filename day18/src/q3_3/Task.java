package q3_3;

public class Task implements Runnable {

    private int userID;
    private int taskID;
    private int wait;

    public Task(int userID, int taskID, int wait) {
        this.userID = userID;
        this.taskID = taskID;
        this.wait = wait;
    }

    @Override
    public void run() {
        System.out.println("Start  > User " + userID + ", Task " + taskID + ".");
        try {
            Thread.sleep(wait);
        } catch (InterruptedException ex) {
            // do nothing
        }
        System.out.println("-- End > User " + userID + ", Task " + taskID + ".");
    }

    public int getWait() {
        return wait;
    }


}