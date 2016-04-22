package q11;

public class PhoneLauncher {

    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        MobilePhone mp = new MobilePhone();
        mp.printLastNumbers();
        mp.call("1");
        mp.call("2");
        mp.call("3");
        mp.call("4");
        mp.call("5");
        mp.call("6");
        mp.call("7");
        mp.printLastNumbers();
        mp.call("8");
        mp.call("9");
        mp.call("10");
        mp.call("11");
        mp.call("12");
        mp.call("13");
        mp.call("14");
        mp.printLastNumbers();

        SmartPhone sp = new SmartPhone();
        System.out.println("Launcher says+++> sp.call");
        sp.call("1234");
        System.out.println("Launcher says+++> sp.browseWeb");
        sp.browseWeb("BBC");
        System.out.println("Launcher says+++> sp.ringAlarm");
        sp.ringAlarm("time for school");
        System.out.println("Launcher says+++> sp.printLastNumbers");
        sp.printLastNumbers();

    }

}	