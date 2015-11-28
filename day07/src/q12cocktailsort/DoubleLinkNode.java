package q12cocktailsort;

public class DoubleLinkNode {

    private int theNumber;
    private DoubleLinkNode previousNode;
    private DoubleLinkNode nextNode;

    public DoubleLinkNode(int theNumber) {
        this.theNumber = theNumber;
        this.previousNode = null;
        this.nextNode = null;
    }

    public int getTheNumber() {
        return this.theNumber;
    }

    public void setTheNumber(int theNumber) {
        this.theNumber = theNumber;
    }

    public DoubleLinkNode getPreviousNode() {
        return this.previousNode;
    }

    public DoubleLinkNode getNextNode() {
        return this.nextNode;
    }

    public void addDoubleLinkNode(DoubleLinkNode newNode) {
        if (this.nextNode == null) {
            this.nextNode = newNode;
            newNode.previousNode = this;
        } else {
            this.nextNode.addDoubleLinkNode(newNode);
        }
    }

    public void printList() {
        DoubleLinkNode currentNode = this;
        do {
            System.out.print(" > " + currentNode.theNumber);
            currentNode = currentNode.nextNode;
        } while (currentNode != null);
        System.out.println();
    }
}	
