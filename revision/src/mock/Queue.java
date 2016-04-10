public class Queue {
    private QueueNode head, tail;

    // constructor
    public void Queue() {
        head = tail = null;
    }

    public synchronized void enqueue(Object ob) {
        QueueNode n = new QueueNode(ob);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.setLink(n);
            tail = n;
        }
        notifyAll();
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (head == null) {
            wait();
        }
        Object ob = head.Ob();
        head = head.getLink();
        return ob;
    }

    class QueueNode {
        private Object ob;
        private QueueNode prev;

        // constructors
        public QueueNode(Object o) {
            ob = o;
            prev = null;
        }

        public QueueNode(Object o, QueueNode n) {
            ob = o;
            prev = n;
        }

        // accessors
        public Object Ob() {
            return ob;
        }

        public QueueNode getLink() {
            return prev;
        }

        // modifiers
        public void setLink(QueueNode n) {
            prev = n;
        }
    }
}