package q2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class DateServerLauncher {


    public static void main(String[] args) {
        DateServerLauncher dsl = new DateServerLauncher();
        dsl.launch();
    }

    public void launch() {

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            LocateRegistry.createRegistry(1099);
            DateServer server = new DateServer();
            String registryHost = "//localhost/";
            String serviceName = "date";
            Naming.rebind(registryHost + serviceName, server);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
