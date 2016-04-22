package q3;

public class SmartPhone extends MobilePhone {
    private final static int START = 0;
    private final static int END = 2;
    private final static String PREFIX = "00";

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String page) {
        System.out.println("BROWSE (from SmartPhone): " + page);
    }


    public String findPosition() {
        return "You are in London (from SmartPhone)";
    }

    @Override
    public void call(String number) {
        if (number.substring(START, END).equals(PREFIX)) {
            System.out.println("Calling " + number + " through the internet to save money");
        } else {
            super.call(number);
        }
    }


}