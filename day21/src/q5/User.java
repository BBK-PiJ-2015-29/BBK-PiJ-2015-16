package q5;

import java.time.LocalDateTime;

public class User {

    private String userName;
    private LocalDateTime time;
    private boolean loggedOn;

    public User(String userName) {
        this.userName = userName;
        this.loggedOn = false;
    }

    public String getUserName() {
        return userName;
    }

    public boolean getLoggedOn() {
        return loggedOn;
    }

    public void setLoggedOn(boolean status) {
        this.loggedOn = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


}
