package impl;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Calendar;

/**
 * A class to provide and set the current time, used by implementations of ContactManager.
 * This can be either the system time, or set to another fixed time (which is useful for testing etc.).
 */

public class Clock {

    static Calendar current;

    /**
     * Returns the current time, as determined by the system clock or a previously set fixed time.
     *
     * @return the Calendar containing the current time.
     */
    public static Calendar getCurrent() {
        throw new NotImplementedException();
    }

    /**
     * Sets the current time to that of the system time.
     */
    public static void resetToSystemTime() {
        throw new NotImplementedException();
    }

    /**
     * Sets the current time to a fixed point in time.
     *
     * @param fixedTime the time which the ContactManager which consider as the current time.
     */
    public static void setTime(Calendar fixedTime) {
        throw new NotImplementedException();
    }

}
