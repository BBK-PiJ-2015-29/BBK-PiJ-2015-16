package q3_3;

import java.util.concurrent.Executor;

/**
 * An executor that returns max wait
 */

interface SimpleExecutor extends Executor {


    /**
     * @return the (theoretical) wait before a new task would start
     */

    int getMaxWaitingTime();


}
