package q10sortedlist;

public class Node {

    private int theNumber;
    private Node nextNode;

    public Node(int theNumber) {
        this.theNumber = theNumber;
        this.nextNode = null;
    }

    public void addNumber(Node newNode) {
        Node currentNode = this;

        if (newNode.theNumber < currentNode.theNumber) {
            int temp = newNode.theNumber;
            newNode.theNumber = currentNode.theNumber;
            currentNode.theNumber = temp;
            Node tempNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            newNode.nextNode = tempNode;
            return;
        }


        // look for the slot

        while (currentNode.nextNode != null) {
            // ... where the new Number is first time > current & put it after
            if (currentNode.nextNode.theNumber >= newNode.theNumber) {
                newNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = newNode;
                return;
            }
            currentNode = currentNode.nextNode;
        }

        // we are at the end, add new Node after current IF new Node > current

        if (newNode.theNumber >= currentNode.theNumber) {
            currentNode.nextNode = newNode;
        } else { // if new Node <= current, add new Node before current.
            int temp = newNode.theNumber;
            newNode.theNumber = currentNode.theNumber;
            currentNode.theNumber = temp;
            currentNode.nextNode = newNode;
        }
    }


    public int size() {
        Node currentNode = this;
        int result = 1;
        while (currentNode.nextNode != null) {
            result++;
            currentNode = currentNode.nextNode;
        }
        return result;
    }

    public void printNumbers() {
        Node currentNode = this;
        System.out.print("List size: " + this.size() + " Contains: ");
        while (currentNode.nextNode != null) {
            System.out.print(currentNode.theNumber + ", ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.theNumber);
    }
}