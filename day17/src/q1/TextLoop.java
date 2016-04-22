package q1;

public class TextLoop implements Runnable {

    public static final int COUNT = 10;

    private final String name;

    public TextLoop(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop:" + name + ", iteration:" + i + ".");
        }
    }
}