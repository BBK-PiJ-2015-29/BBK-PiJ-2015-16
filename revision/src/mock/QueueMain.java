package mock;

public class QueueMain {
    public static void main(String[] args) {
        Queue Q = new Queue();
        SetVals set = new SetVals(Q);
        GetVals get = new GetVals(Q);
        get.start();
        set.start();
    }
}
