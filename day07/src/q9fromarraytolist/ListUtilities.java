package q9fromarraytolist;

public class ListUtilities {

    public static Node intArrayToList(int[] intArray) {
        Node listStart = new Node(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            Node newNode = new Node(intArray[i]);
            listStart.addNode(newNode);
        }
        return listStart;
    }
}

