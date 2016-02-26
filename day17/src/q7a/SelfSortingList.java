package q7a;

public class SelfSortingList {

    private Sorter sorter;
    private Node head;
    private boolean stop;

    public SelfSortingList() {
        head = new Node();
        stop = false;
        sorter = new Sorter(this);
        Thread t = new Thread(sorter);
        t.start();
    }

    public boolean getStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        sorter.setSorted(false);
    }

    public void add(int item) {
        Node newNode = new Node(item);
        Node currentNode = head;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(newNode);
        sorter.setSorted(false);
    }

    public int get(int place) {
        return sorter.get(place);
    }

    public int getPlace(int place) {
        int count = 0;
        Node runner;
        if (head.getNextNode() != null) {
            runner = head.getNextNode();
        } else {
            return -1;
        }
        while (runner.getNextNode() != null) {
            if (count == place) {
                return runner.getItem();
            }
            runner = runner.getNextNode();
            count++;
        }
        return -1;
    }


    public void printList() {
        Node runner;
        if (head.getNextNode() != null) {
            runner = head.getNextNode();
        } else {
            System.out.println("List is empty");
            return;
        }
        while (runner.getNextNode() != null) {
            System.out.print(runner.getItem() + " < ");
            runner = runner.getNextNode();
        }
        System.out.println(runner.getItem());
    }

    public boolean sort() {
        Node runner;
        if (head.getNextNode() != null) {
            runner = head.getNextNode();
        } else {
            return true;
        }
        //do a little bit of sorting
        int count = 0;
        while (runner.getNextNode() != null && count < 3) {
            if (runner.getItem() > runner.getNextNode().getItem()) {
                int temp = runner.getItem();
                runner.setItem(runner.getNextNode().getItem());
                runner.getNextNode().setItem(temp);
                count++;
            }
            runner = runner.getNextNode();
        }
        //check if list is sorted
        boolean done = true;
        runner = head.getNextNode();
        while (runner.getNextNode() != null) {
            if (runner.getItem() > runner.getNextNode().getItem()) {
                done = false;
            }
            runner = runner.getNextNode();
        }
        printList();
        if (done) {
            return true;
        }
        return false;
    }
}

class Node {

    private int item;
    private Node nextNode;

    public Node() {
        this.nextNode = null;
    }

    public Node(int item) {
        this.item = item;
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
}	