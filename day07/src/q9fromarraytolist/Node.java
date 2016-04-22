package q9fromarraytolist;

public class Node {

    private int theNumber;
    private Node nextNode;

    public Node(int theNumber) {
        this.theNumber = theNumber;
        this.nextNode = null;
    }

    public void addNode(Node newNode) {
        if (this.nextNode == null) {
            this.nextNode = newNode;
        } else {
            this.nextNode.addNode(newNode);
        }
    }

    public void printList() {
        Node currentNode = this;
        do {
            System.out.print(" > " + currentNode.theNumber);
            currentNode = currentNode.nextNode;
        } while (currentNode != null);
        System.out.println();
    }


}	
