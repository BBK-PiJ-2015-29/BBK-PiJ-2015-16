package q4;

public class MobilePhone extends OldPhone {
    private final static int MAX = 10;

    private String[] lastNumber = new String[MAX];
    private int index = 0;

    public MobilePhone(String brand) {
        super(brand);
    }

    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Saving number to recent calls (from MobilePhone)");
        if (index < MAX) {
            lastNumber[index++] = new String(number);
        } else { // throw away the first number and shift the rest down
            System.arraycopy(lastNumber, 1, lastNumber, 0, MAX - 1);
            lastNumber[MAX - 1] = number;
        }
        System.out.println("Number of numbers recorded = " + index);
    }

    public void ringAlarm(String alarm) {

        System.out.println("WAKE UP (from MobilePhone): " + alarm);

    }


    void playGame(String game) {

        System.out.println("PLAY (from MobilePhone): " + game);

    }

    public void printLastNumbers() {

        System.out.println("== LAST " + index + " NUMBERS (from MobilePhone) ==");
        for (int i = 0; i < index; i++)
            System.out.println("[" + (i + 1) + "] = " + lastNumber[i]);
    }


}