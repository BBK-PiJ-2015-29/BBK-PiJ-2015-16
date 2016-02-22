package q3_3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Test {

    public static final int TIME_USER_WILL_WAIT = 4000;
    public static final int NUMBER_OF_USERS = 4;

    public static void main(String[] args) {
        SimpleExecutor taskExecutor = new SimpleExecutorImpl();

        ScheduledExecutorService userExecutor = Executors.newScheduledThreadPool(5);

        for (int userID = 0; userID < NUMBER_OF_USERS; userID++) {
            Runnable r = new User(taskExecutor, userID, TIME_USER_WILL_WAIT);
            userExecutor.execute(r);
        }
        userExecutor.shutdown();
    }
}


