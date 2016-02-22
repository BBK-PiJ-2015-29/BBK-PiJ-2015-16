package q3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class CalculatorServerLauncher {

    public static void main(String[] args) {
        CalculatorServerLauncher csl = new CalculatorServerLauncher();
        csl.launch();
    }

    public void launch() {

        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            LocateRegistry.createRegistry(1099);
            CalculatorServer server = new CalculatorServer();
            String registryHost = "//localhost/";
            String serviceName = "calculator";
            Naming.rebind(registryHost + serviceName, server);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }


}
