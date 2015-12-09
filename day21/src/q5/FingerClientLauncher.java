package q5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class FingerClientLauncher {

    public static void main(String[] args) {
        FingerClientLauncher fcl = new FingerClientLauncher();
        fcl.launch();
    }

    public void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/finger");
            FingerService fingerService = (FingerService) service;
            String response = fingerService.usersReport();
            System.out.println("Finger Service Response: " + response);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
