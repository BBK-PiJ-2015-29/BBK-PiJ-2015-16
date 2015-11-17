public class Node {
    private int value;
    private Node next;
    
    public Node(int value){
        this(value,null);
    }
    
    public Node(int value, Node next){
        setValue(value);
        setNext(next);
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
}