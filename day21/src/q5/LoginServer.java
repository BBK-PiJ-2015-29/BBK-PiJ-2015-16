package q5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;


public class LoginServer extends UnicastRemoteObject implements LoginService {

    private List<User> users;

    public LoginServer() throws RemoteException {
        users = new LinkedList<User>();
        users.add(new User("Mark"));
        users.add(new User("Anna"));
        users.add(new User("Fred"));
        users.add(new User("Jane"));
    }

    @Override
    public String login(String user) throws RemoteException {
        for (User u : users) {
            if (u.getUserName().equals(user)) {
                u.setLoggedOn(true);
                u.setTime(LocalDateTime.now());
                String result = "Hi " + user + ", you are now logged on (" + u.getTime().toString() + ")";
                return result;
            }
        }
        return "Sorry " + user + ", unable to log you on.";
    }

    public String logoff(String user) {
        for (User u : users) {
            if (u.getUserName().equals(user)) {
                u.setLoggedOn(false);
                String result = "Hi " + user + ", you are now logged off";
                return result;
            }
        }
        return "Sorry " + user + ", unable to log you off.";
    }

    public List<User> getUsers() {
        return users;
    }

}
