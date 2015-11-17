public class Node {
    private int value;
    private Node prev;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public void addNode(Node newNode) {
        //if last in the list
        if (this.next == null) {
            this.next = newNode;
            newNode.next = null;
            newNode.prev = this;
        } else {
            this.next.addNode(newNode);
        }
    }

    public boolean deleteNode(Node node) {
        if (this.next == null) {
            return false;
        } else if (this.next.value == node.value) {
            this.next = next.next;
            next.prev = this;
            return true;
        } else {
            return this.next.deleteNode(node);
        }
    }

    public void printNodes(Node node) {
        if (node.next == null) {
            System.out.println(node + "\n");
        } else {
            System.out.println(node);
            printNodes(node.next);
        }
    }

    @Override
    public String toString() {
        return "Value:" + this.value;
    }

    public void printReverseNodes(Node node) {
        if (node.next == null) {
            System.out.println(node);
        } else {
            printReverseNodes(node.next);
            System.out.println(node);
        }
    }

}