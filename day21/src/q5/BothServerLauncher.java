package q5;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;


public class BothServerLauncher {

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Registry registry = LocateRegistry.getRegistry();
            LoginServer loginServer = new LoginServer();
            List<User> users = loginServer.getUsers();
            FingerServer fingerServer = new FingerServer(users);

            String registryHost = "//localhost/";
            String serviceName = "login";
            String fServiceName = "finger";

            registry.rebind(registryHost + serviceName, loginServer);
            registry.rebind(registryHost + fServiceName, fingerServer);
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }


    }

}
