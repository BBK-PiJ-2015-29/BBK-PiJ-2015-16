package dividing;

public class Calculator {


    private int add(int x, int y) {
        int result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        return result;
    }

    private void subtract(int x, int y) {
        int result = x - y;
        System.out.println(x + " - " + y + " = " + result);
    }

    private void multiply(int x, int y) {
        int result = x * y;
        System.out.println(x + " * " + y + " = " + result);
    }

    private void modulus(int x, int y) {
        int result = x % y;
        System.out.println("The remainder of " + x + " / " + y + " = " + result);
    }

    private void divide(int x, int y) {
        double a = (double) x;
        double b = (double) y;
        double result = a / b;
        System.out.println(x + " / " + y + " = " + result);
    }


}	