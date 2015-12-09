package q5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FingerService extends Remote {

    public String usersReport() throws RemoteException;

}
