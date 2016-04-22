package q11bubblesort;

public class Node {

    private int theNumber;
    private Node nextNode;

    public Node(int theNumber) {
        this.theNumber = theNumber;
        this.nextNode = null;
    }

    public int getTheNumber() {
        return this.theNumber;
    }

    public void setTheNumber(int theNumber) {
        this.theNumber = theNumber;
    }

    public Node getNextNode() {
        return this.nextNode;
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
