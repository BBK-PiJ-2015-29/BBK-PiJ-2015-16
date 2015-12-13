import java.util.Random;

public class RandomOddity {
    public static void main(String[] args) {
        Random random = new Random(-6732303926L);
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(10) + " ");
    }
}
