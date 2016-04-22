package q12;

public class SmartPhone extends MobilePhone {

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
        super.call(number);
        if (number.substring(0, 2).equals("00")) {
            System.out.println("via Internet to save money (from SmartPhone)");
        }
    }


    public void playGame(String game) {
//		calling super() on a private method doesn't work 
//		super.playGame(game);
//		so only option is to put the method here as well.
        System.out.println("PLAY (from SmartPhone): " + game);
    }


}