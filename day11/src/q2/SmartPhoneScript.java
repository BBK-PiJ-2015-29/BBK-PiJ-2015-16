package q2;

public class SmartPhoneScript {

    public static void main(String[] args) {
        SmartPhoneScript sps = new SmartPhoneScript();
        System.out.println();
        System.out.println("=== 2.1 Start ===");
        sps.launch1();
        System.out.println("=== 2.2 Start ===");
        sps.launch2();
    }

    //	2.1 Set-up works fine
    public void launch1() {
        System.out.println();
        SmartPhone myPhone = new SmartPhone("nokia");
        System.out.println("Brand: " + myPhone.getBrand());
        myPhone.browseWeb("Page to browse");
        System.out.println(myPhone.findPosition());
        myPhone.call("1234");
        myPhone.printLastNumbers();
        myPhone.call("001234");
        myPhone.playGame("wk 11 game");
        myPhone.ringAlarm("wk 11 alarm");
        System.out.println();
    }

    //	2.2.1 Won't compile these three methods in SmartPhone....
    public void launch2() {
        System.out.println();
        MobilePhone myPhone = new SmartPhone("nokia");
        System.out.println("Brand: " + myPhone.getBrand());
//		myPhone.browseWeb("Page to browse");
//		System.out.println(myPhone.findPosition());
        myPhone.call("1234");
        myPhone.printLastNumbers();
        myPhone.call("001234");
//		myPhone.playGame("wk 11 game");
        myPhone.ringAlarm("wk 11 alarm");
        System.out.println();

//	2.2.2 Can fix by DIRECT UPCASTING to a SmartPhone....

        System.out.println("===> ====> NOW UPCAST ====> ====>");
        SmartPhone mySmartPhone = (SmartPhone) myPhone;
        System.out.println("Brand: " + mySmartPhone.getBrand());
        mySmartPhone.browseWeb("Page to browse");
        System.out.println(mySmartPhone.findPosition());
        mySmartPhone.call("1234");
        mySmartPhone.printLastNumbers();
        mySmartPhone.call("001234");
        mySmartPhone.playGame("wk 11 game");
        mySmartPhone.ringAlarm("wk 11 alarm");
        System.out.println();

        // for 2.3
        testPhone1(myPhone);
        // for 2.4 and 2.5
        testPhone2(myPhone);
    }

//	2.3 INDIRECT UPCASTING when calling a method


    //	will only do call(), which is the only one in the interface Phone
    public void testPhone1(Phone p) {

        System.out.println("=== 2.3 Start ===");
//		System.out.println("Brand: " + p.getBrand());
//		p.browseWeb("Page to browse");
//		System.out.println(p.findPosition());
        p.call("1234");
//		p.printLastNumbers();
        p.call("001234");
//		p.playGame("wk 11 game");
//		p.ringAlarm("wk 11 alarm");
        System.out.println();
    }

//	2.4/2.5	and then DOWNCASTING within the method so can use all methods

    public void testPhone2(Phone p) {

        System.out.println("=== 2.4 Start ===");
        SmartPhone sp = (SmartPhone) p;
        System.out.println("Brand: " + sp.getBrand());
        sp.browseWeb("Page to browse");
        System.out.println(sp.findPosition());
        sp.call("1234");
        sp.printLastNumbers();
        sp.call("001234");
        sp.playGame("wk 11 game");
        sp.ringAlarm("wk 11 alarm");
        System.out.println();
    }


}




