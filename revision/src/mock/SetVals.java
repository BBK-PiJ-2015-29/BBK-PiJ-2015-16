package mock;

public class SetVals extends Thread {
    private Queue Q;

    // constructor
    public SetVals(Queue oneQ) {
        Q = oneQ;
    }

    @Override
    public void run() {
        Integer ch;
        int c;
        do {
            c = getNextChar();
            ch = new Integer(c);
            Q.enqueue(ch);
        }
        while (c != -1);
    }

    int getNextChar() {
        int c;
        try {
            // read char or eof
            c = System.in.read();
        } catch (java.io.IOException e) {
            return -1;
        }
        return c;
    }
}
