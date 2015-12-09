package q5;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface LoginService extends Remote {

    String login(String user) throws RemoteException;

    String logoff(String user) throws RemoteException;

    List<User> getUsers() throws RemoteException;
}
