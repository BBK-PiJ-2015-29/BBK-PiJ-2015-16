// Demonstrates usage of the IntList interface.

package example;

public class ListClient {
   public static void main(String[] args) {
      IntList myList = new ArrayIntList();
      addAndPrint(myList);
   
      IntList list2 = new LinkedIntList();
      addAndPrint(list2);
   
   }

   // Calls several methods on an ArrayIntList.
   // pre: list is not null
   public static void addAndPrint(IntList list) {
      list.add(34);
      list.add(17);
      list.add(23);
      list.add(1, 6);
   
      System.out.println(list);
      list.remove(0);
   
      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
   }
}
