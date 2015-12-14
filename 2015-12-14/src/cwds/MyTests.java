package cwds;

public class MyTests {
    public static void main(String[] args) {
        ReturnObject ro;

        // no error

        ro = new ReturnObjectImpl(3);
        if ((ro.getError()).equals(ErrorMessage.NO_ERROR)) {
            System.out.println("all good");
        } else {
            System.out.println("not good");
        }

        // has error

        ro = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
        if ((ro.getError()).equals(ErrorMessage.INVALID_ARGUMENT)) {
            System.out.println("all good");
        } else {
            System.out.println("not good");
        }
    }
}
