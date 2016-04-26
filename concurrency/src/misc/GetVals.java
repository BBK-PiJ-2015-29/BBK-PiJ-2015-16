package misc;

public class GetVals extends Thread {
    private Queue Q;

    // constructor
    public GetVals(Queue oneQ) {
        Q = oneQ;
    }

    @Override
    public void run() {
        Integer ch;
        int c;
        char oneChar;

        try {
            do {
                ch = (Integer) Q.dequeue();
                c = ch.intValue();
                if (c != -1) {
                    oneChar = (char) c;
                    System.out.print(oneChar);
                }
            }
            while (c != -1);
        } catch (InterruptedException e) {
            return;
        }
    }
}
