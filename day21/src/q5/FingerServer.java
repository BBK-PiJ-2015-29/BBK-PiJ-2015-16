package q5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class FingerServer extends UnicastRemoteObject implements FingerService {

    private List<User> users;

    public FingerServer(List<User> users) throws RemoteException {
        this.users = users;
    }

    @Override
    public String usersReport() throws RemoteException {

        String newline = System.getProperty("line.separator");
        String result = newline + "==== Finger Service User Report  ====";
        int i = 0;
        for (User u : users) {
            if (u.getLoggedOn()) {
                result = result + newline + "USER:" + u.getUserName() + " LOGGED ON AT: " + u.getTime();
                i++;
            }
        }
        return result + newline;
    }

}
