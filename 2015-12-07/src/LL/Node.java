package LL;

public class Node<T> {
    /* two fields, the first to store the item itself,
     * the second is a pointer to the next node in the linked list.
     * If there is no next node, the pointer is null.
     */
    private T item;
    private Node<T> nextNode;

    /*
     * @param	value, the value for the node
     * @param	next, the next node in the linked list
     */
    public Node(T value, Node<T> next) {
        item = value;
        nextNode = next;
    }

    public T getValue() {
        return item;
    }

    public void setValue(T value) {
        item = value;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> newNext) {
        nextNode = newNext;
    }

}