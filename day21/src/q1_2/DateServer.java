package q1_2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;


public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
        //nothing to intialise
    }

    @Override
    public LocalDate getDate() throws RemoteException {
        LocalDate ld = LocalDate.now();
//		String result = ld.toString();
//		String result = "A date";
        return ld;
    }

}
