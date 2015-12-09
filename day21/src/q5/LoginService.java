package q5;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface LoginService extends Remote {

    public String login(String user, String password) throws RemoteException;

    public String logoff(String user) throws RemoteException;

    public List<User> getUsers() throws RemoteException;
}
