package q12;

public class SmartPhoneScript {
    private static MobilePhone myPhone;

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4(myPhone);
//        test5(myPhone);
        test6(new MobilePhone("Apple"));
    }

    private static void test1() {
        SmartPhone myPhone = new SmartPhone("Samsung");
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

    //	2.2 Won't compile these three methods in SmartPhone....

    private static void test2() {
        myPhone = new SmartPhone("Samsung");
        System.out.println("Brand: " + myPhone.getBrand());
//		myPhone.browseWeb("Page to browse");
//		System.out.println(myPhone.findPosition());
        myPhone.call("1234");
        myPhone.printLastNumbers();
        myPhone.call("001234");
//		myPhone.playGame("wk 11 game");
        myPhone.ringAlarm("wk 11 alarm");
        System.out.println();
    }

//	2.2 Can fix by DIRECT UPCASTING to a SmartPhone....

    private static void test3() {

        System.out.println("===> ====> NOW UPCAST ====> ====>");
        // SmartPhone mySmartPhone = (SmartPhone) myPhone;
        System.out.println("Brand: " + myPhone.getBrand());
        ((SmartPhone) myPhone).browseWeb("Page to browse");
        System.out.println(((SmartPhone) myPhone).findPosition());
        myPhone.call("1234");
        myPhone.printLastNumbers();
        myPhone.call("001234");
        ((SmartPhone) myPhone).playGame("wk 11 game");
        myPhone.ringAlarm("wk 11 alarm");
        System.out.println();
    }

//	2.3 INDIRECT UPCASTING when calling a method


    //	will only do call(), which is the only one in the interface Phone
    private static void test4(Phone p) {
//        System.out.println("Brand: " + p.getBrand());
//		p.browseWeb("Page to browse");
//		System.out.println(p.findPosition());
        p.call("1234");
//		p.printLastNumbers();
        p.call("001234");
//		p.playGame("wk 11 game");
//		p.ringAlarm("wk 11 alarm");
        System.out.println();
    }

//	2.4	and then DOWNCASTING within the method so can use all methods

    private static void test5(Phone p) {

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

    // 2.5
    //  test6(new MobilePhone("Apple"));
    private static void test6(Phone p){
        p.call("Call Me!");
        System.out.println(((MobilePhone)p).getBrand());
        ((SmartPhone)p).browseWeb("thing");
    }
}



