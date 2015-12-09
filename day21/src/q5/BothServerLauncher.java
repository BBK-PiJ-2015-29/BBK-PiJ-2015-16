package q5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;


public class BothServerLauncher {

    public static void main(String[] args) {
        BothServerLauncher bsl = new BothServerLauncher();
        bsl.launch();
    }

    public void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            LocateRegistry.createRegistry(1099);
            LoginServer server = new LoginServer();
            List<User> users = server.getUsers();
            FingerServer fServer = new FingerServer(users);
            String registryHost = "//localhost/";
            String serviceName = "login";
            String fServiceName = "finger";
            Naming.rebind(registryHost + serviceName, server);
            Naming.rebind(registryHost + fServiceName, fServer);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }


    }

}
