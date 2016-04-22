package Ex_StringStackExamples;

/**
 * Implementation of interface stack using a
 * dynamic structure as support.
 */
public class PointerStringStack implements StringStack {
    /**
     * The head of the stack: the visible node
     */
    private StringStackNode head;

    public PointerStringStack() {
        head = null;
    }

    @Override
    public void push(String newText) {
        StringStackNode newNode = new StringStackNode(newText);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    @Override
    public String pop() {
        if (head == null) {
            return null;
        }
        String result = head.getText();
        head = head.getNext();
        return result;
    }

    @Override
    public String peek() {
        if (head == null) {
            return null;
        }
        return head.getText();
    }

    @Override
    public boolean isEmpty() {
        return (getSize() == 0);
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
        int result = 0;
        StringStackNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            result++;
        }
        return result;
    }
}