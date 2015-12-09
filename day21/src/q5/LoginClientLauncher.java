package q5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class LoginClientLauncher {

    public static void main(String[] args) {
        LoginClientLauncher lcl = new LoginClientLauncher();
        lcl.launch();
    }

    public void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/login");
            LoginService loginService = (LoginService) service;
            String response = loginService.login("Mark", "pwmark");
            System.out.println("Response: " + response);
            System.out.println("Response: " + loginService.login("Anna", "pwanna"));
//			System.out.println("Response: " + loginService.logoff("Mark"));
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}