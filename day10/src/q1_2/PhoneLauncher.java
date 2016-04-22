package q12;

public class PhoneLauncher {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
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

    }

}	