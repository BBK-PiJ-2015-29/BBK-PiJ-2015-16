package q11;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class EchoServer extends UnicastRemoteObject implements EchoService {

    public EchoServer() throws RemoteException {
        // nothing to initialise for this server
        //(must have a constructor that throws RemoteException)
    }

    @Override
    public String echo(String s) throws RemoteException {
        System.out.println("Replied to some client saying '" + s + "'");
        return ("Hello!: " + s);
    }
}
