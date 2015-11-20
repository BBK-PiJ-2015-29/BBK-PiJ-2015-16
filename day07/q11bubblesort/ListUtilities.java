package q11bubblesort;

public class ListUtilities {

    //Turn an array of integers into a linked list
    public static Node intArrayToList(int[] intArray) {
        Node listStart = new Node(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            Node newNode = new Node(intArray[i]);
            listStart.addNode(newNode);
        }
        return listStart;
    }

    //Sort a list of integers
    public static Node bubbleSort(Node firstNode) {

        boolean done = false;
        Node currentNode;
        Node nextNode;

        while (!done) {
            //start from first note (the start of list)
            currentNode = firstNode;
            // move the biggest number to the end
            while (currentNode.getNextNode() != null) {
                nextNode = currentNode.getNextNode();
                // if this number is > next number then swap them
                if (currentNode.getTheNumber() > nextNode.getTheNumber()) {
                    int temp = currentNode.getTheNumber();
                    currentNode.setTheNumber(nextNode.getTheNumber());
                    nextNode.setTheNumber(temp);
                }
                currentNode = nextNode;
            }
            //check if list is in order...
            currentNode = firstNode;
            done = true;
            while (currentNode.getNextNode() != null) {
                nextNode = currentNode.getNextNode();
                if (currentNode.getTheNumber() > nextNode.getTheNumber()) {
                    done = false;
                }
                currentNode = nextNode;
            }
            // repeat, with first thing being to reset current node to first node.
        }
        return firstNode;
    }
}

