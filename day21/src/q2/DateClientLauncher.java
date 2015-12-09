package q2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;


public class DateClientLauncher {

    public static void main(String[] args) {
        DateClientLauncher dcl = new DateClientLauncher();
        dcl.launch();
    }

    public void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/date");
            DateService dateService = (DateService) service;
            LocalDate date = dateService.getDate();
            System.out.println("Today is: " + date.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
