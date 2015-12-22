package q4;

public class PhoneLauncher {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("nokia");
        System.out.println("Launcher says+++> sp.call not 00");
        sp.call("1234");
        System.out.println("Launcher says+++> sp.call WITH 00");
        sp.call("001234");

        System.out.println("Launcher says+++> sp.browseWeb");
        sp.browseWeb("BBC");
        System.out.println("Launcher says+++> sp.ringAlarm");
        sp.ringAlarm("time for school");
        System.out.println("Launcher says+++> sp.printLastNumbers");
        sp.printLastNumbers();
        System.out.println();
        System.out.println();
        System.out.println("=== X3 ====");
        System.out.println();
        System.out.println("Launcher says+++> sp.getBrand (a method in OldPhone)");
        System.out.println("Brand is: " + sp.getBrand());

        sp.playGame("Tetris");

    }

}	