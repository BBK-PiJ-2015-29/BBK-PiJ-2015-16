package q12cocktailsort;

public class ListUtilities {

    //Turn an array of integers into a single linked list
    public static Node intArrayToList(int[] intArray) {
        Node listStart = new Node(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            Node newNode = new Node(intArray[i]);
            listStart.addNode(newNode);
        }
        return listStart;
    }

    //Turn an array of integers into a double linked list
    public static DoubleLinkNode intArrayToDoubleLinkList(int[] intArray) {
        DoubleLinkNode listStart = new DoubleLinkNode(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            DoubleLinkNode newNode = new DoubleLinkNode(intArray[i]);
            listStart.addDoubleLinkNode(newNode);
        }
        return listStart;
    }


    public static DoubleLinkNode cocktailSort(DoubleLinkNode firstNode) {
        boolean done = false;
        DoubleLinkNode currentNode;
        DoubleLinkNode nextNode;
        DoubleLinkNode previousNode;

        while (!done) {
            //start from first node (the start of list)
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

            //start from last node (the end of list)..
            //(which is where we already are with current node)

            while (currentNode.getPreviousNode() != null) {
                previousNode = currentNode.getPreviousNode();
                if (currentNode.getTheNumber() < previousNode.getTheNumber()) {
                    int temp = currentNode.getTheNumber();
                    currentNode.setTheNumber(previousNode.getTheNumber());
                    previousNode.setTheNumber(temp);
                }
                currentNode = previousNode;
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

