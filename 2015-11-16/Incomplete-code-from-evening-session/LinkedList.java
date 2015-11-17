public class LinkedList {
    private Node head;
    
    public LinkedList(){
        head = null;
    }
    
    public add(int item){
        Node n = new Node(item);
        //if (head == null)
        //    head = n;
        //else
        Node ptr = head;
        int count = 0;
        while (ptr.getNext() !=null){
            ptr = ptr.getNext();
            count++;
        }
        ptr = n;
    }
}
