package q3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;


public class CalculatorClientLauncher {

    public static void main(String[] args) {
        CalculatorClientLauncher ccl = new CalculatorClientLauncher();
        ccl.launch();
    }

    public void launch() {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/calculator");
            CalculatorService calcService = (CalculatorService) service;
            int c = calcService.add(2, 3);
            System.out.println("2 + 3 = " + c);
            System.out.println("7 - 3 = " + calcService.subtract(7, 3));
            System.out.println("2 * 3 = " + calcService.multiply(2, 3));
            System.out.println("7 / 2 = " + calcService.divide(7, 2));

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }


}
