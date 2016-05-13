package threading;

import static java.lang.Thread.sleep;

public class SimpleThread implements Runnable {
    private String name;


    public SimpleThread(String str) {
        this.name = str;
    }

    String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Completed -  " + getName());
    }
}
