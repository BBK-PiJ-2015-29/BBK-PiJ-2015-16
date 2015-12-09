package q1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EchoServerLauncher {

    public static void main(String[] args) {
        // if there is no security manager, start one
        if (System.getSecurityManager() == null) {
            System.out.println(">1<");
            System.setSecurityManager(new SecurityManager());
            System.out.println(">2<");
        }
        try {
            //create the registry if there is not one
            System.out.println(">3<");
            Registry registry = LocateRegistry.getRegistry();

            //create the server object
            System.out.println(">4<");
            EchoServer server = new EchoServer();

            //register (bind) the server object on the registry
            //The registry may be on a different machine

            System.out.println(">5<");
            registry.rebind("Echo", server);
            System.out.println(">6<");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
