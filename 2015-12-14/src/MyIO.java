import java.util.Scanner;

public class MyIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide an integer (int) : ");
        int i = sc.nextInt();

        System.out.println("Int value is " + i);
    }
}
