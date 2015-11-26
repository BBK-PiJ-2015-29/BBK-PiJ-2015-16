// A LinkedIntList stores an ordered list of integers.

public class LinkedIntList implements IntList {
   private ListNode front;
   
   // Initializes a new empty list
   public LinkedIntList() {
      front = null;
   }
   
   // Build a new list with nodes of values n to 0.
   // Pre: n >= 0, throws an IllegalArgumentException otherwise
   public LinkedIntList(int count) {
      if (count < 0) {
         throw new IllegalArgumentException();
      }
      for(int i = 0; i <= count; i++) {
         front = new ListNode(i, front);
      }
   }
      
   // Adds the given value to the end of the list.
   public void add(int value) {
      if(front == null) {
         front = new ListNode(value);
      } else {
         ListNode current = front;
         while(current.next != null) {
            current = current.next;
         }
         current.next = new ListNode(value);
      }
   }
   
   // Adds a value at a given index.
   // Pre: 0 <= index <= size, throws a NullPointerException if index > size.
   public void add(int index, int value) {
      if (index == 0) {
         front = new ListNode(value, front);
      } else {
         ListNode current = front;
         for (int i = 0; i < index - 1; i++) {
            current = current.next;
         }
         ListNode temp = new ListNode(value, current.next);
         current.next = temp;
         // also ok: current.next = new ListNode(value, current.next);
      }
   }
   
   // Adds the value in sorted (non-decreasing) order.
   // Pre: list is sorted
   // Post: list is sorted
   public void addSorted(int value) {
      if(front == null || value < front.data) {
         front = new ListNode(value, front);
      } else {
         ListNode current = front;
         while(current.next != null && current.next.data < value) {
            current = current.next;
         }
         current.next = new ListNode(value, current.next);
      }
   }
      
   // Returns the value at the given index.
   // Pre: 0 <= index < size
   public int get(int index) {
      ListNode current = front;
      for(int i = 0; i < index; i++) {
         current = current.next;
      }
      return current.data;
   }
   
   // Returns a comma-separated String representation of this list.
   public String toString() {
      if (front == null) {
         return "[]";
      } else {
         String result = "[" + front.data;
         ListNode current = front.next;
         while (current != null) {
            result += ", " + current.data;
            current = current.next;
         }
         result += "]";
         return result;
      }
   }
   
   // Returns the size of this list (inefficient -- could use a size field).
   public int size() {
      ListNode current = front;
      int size = 0;
      while(current != null) {
         size++;
         current = current.next;
      }
      return size;
   }  
   
   // True if the list is empty, false otherwise
   public boolean isEmpty() {
      return front == null;
   }
   
   // Removes the value at the given index.
   // Pre: 0 <= index < size
   public void remove(int index) {
      if (index == 0) {
         front = front.next;
      } else {
         ListNode current = front;
         for (int i = 0; i < index - 1; i++) {
            current = current.next;
         }
         current.next = current.next.next;
      }
   }
}
