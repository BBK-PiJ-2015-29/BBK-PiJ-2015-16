package q1_2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;


public interface DateService extends Remote {

    public LocalDate getDate() throws RemoteException;
}
