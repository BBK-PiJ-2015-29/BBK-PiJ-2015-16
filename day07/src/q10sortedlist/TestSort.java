package q10sortedlist;

public class TestSort {

    private Node listStart = null;

    public static void main(String[] args) {
        TestSort numList = new TestSort();
        numList.launch();
    }

    private void launch() {
        Node firstNode = new Node(20);
        listStart = firstNode;
        listStart.printNumbers();
        Node aNode = new Node(15);
        listStart.addNumber(aNode);
        listStart.printNumbers();
        Node bNode = new Node(10);
        listStart.addNumber(bNode);
        listStart.printNumbers();
        Node cNode = new Node(25);
        listStart.addNumber(cNode);
        listStart.printNumbers();
        Node dNode = new Node(35);
        listStart.addNumber(dNode);
        listStart.printNumbers();
    }
}



