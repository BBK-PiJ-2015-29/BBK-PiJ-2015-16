// A ListNode represents a single node in a linked list.  It stores an integer 
// value and a link to the next node.

public class ListNode {
   int data;
   ListNode next; 
   
   // Creates a terminal ListNode containing 0 as integer data.
   public ListNode() {
      this(0, null);
   }
   
   // Creates a terminal ListNode with the specified integer data.
   public ListNode(int data) {
      this(data, null);
   }

   // Creates a ListNode with the specified integer data and next node.
   public ListNode(int data, ListNode next) {
      this.data = data;
      this.next = next;
   }   
}
