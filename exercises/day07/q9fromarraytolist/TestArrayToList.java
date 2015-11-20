package q9fromarraytolist;

public class TestArrayToList {

    private Node listStart = null;

    public static void main(String[] args) {
        TestArrayToList test = new TestArrayToList();
        test.launch();
    }

    private void launch() {
        //set an array
        int[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //make the list
        listStart = ListUtilities.intArrayToList(intArray);
        //print the list
        listStart.printList();
    }
}