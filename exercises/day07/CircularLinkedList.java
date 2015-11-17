public class CircularLinkedList {
    private Node nodeListStart = null;

    public static void main(String[] args) {
        CircularLinkedList circ = new CircularLinkedList();
        circ.run();
    }

    public void printReverseNodes() {
        nodeListStart.printReverseNodes(nodeListStart);
    }

    public void printNodes() {
        nodeListStart.printNodes(nodeListStart);
    }

    public void run() {
        Node node1 = new Node(1);
        nodeListStart = node1;

        Node node2 = new Node(2);
        nodeListStart.addNode(node2);

        Node node3 = new Node(3);
        nodeListStart.addNode(node3);

        Node node4 = new Node(4);
        nodeListStart.addNode(node4);

        Node node5 = new Node(5);
        nodeListStart.addNode(node5);

        Node node6 = new Node(6);
        nodeListStart.addNode(node6);

        Node node7 = new Node(7);
        nodeListStart.addNode(node7);

        Node node8 = new Node(8);
        nodeListStart.addNode(node8);

        Node node9 = new Node(9);
        nodeListStart.addNode(node9);

        Node node10 = new Node(10);
        nodeListStart.addNode(node10);


        nodeListStart.deleteNode(node9);

        //Node endOfList = getListEnd(nodeListStart);
        printNodes();
        printReverseNodes();

        Node node11 = new Node(11);
        nodeListStart.addNode(node11);


    }
}