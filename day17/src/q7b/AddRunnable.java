package q7b;

public class AddRunnable implements Runnable {

    private SelfSortingList ssl;
    private Node node;

    public AddRunnable(SelfSortingList ssl, Node node) {
        this.ssl = ssl;
        this.node = node;
    }

    @Override
    public void run() {
        Node runner = ssl.getHead();
        while (runner.getNextNode() != null) {
            if (node.getItem() < runner.getNextNode().getItem()) {
                node.setNextNode(runner.getNextNode());
                runner.setNextNode(node);
                return;
            }
            runner = runner.getNextNode();
        }
        runner.setNextNode(node);
    }
}
























