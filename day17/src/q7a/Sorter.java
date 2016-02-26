package q7a;

public class Sorter implements Runnable {

    private boolean sorted;
    private SelfSortingList ssl;

    private Object obj = new Object();

    public Sorter(SelfSortingList ssl) {
        sorted = false;
        this.ssl = ssl;
    }

    public synchronized void setSorted(boolean sorted) {
        this.sorted = sorted;
        notifyAll();
    }

    @Override
    public synchronized void run() {
        while (!ssl.getStop() || !sorted) {
            // once sorted is true, wait here...
            while (sorted) {
                System.out.println("|");
                try {
                    wait();
                } catch (InterruptedException ex) {
                    // do nothing
                }
            }
            // guarded block...
            System.out.print(".");
            boolean allInOrder = ssl.sort();
            if (allInOrder) {
                sorted = true;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                // do nothing
            }
        }
    }


    public synchronized int get(int place) {
        while (!sorted) {
            try {
                wait();
            } catch (InterruptedException ex) {
                // do nothing
            }
        }
        return ssl.getPlace(place);
    }

}
























