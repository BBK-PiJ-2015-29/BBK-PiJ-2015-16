public class SLLTest {
    public static SingularlyLinkedList lst;

    public static void main(String[] args) {

        // Default constructor - let's put "0" into head element.
        lst = new SingularlyLinkedList();

        // add more elements to LinkedList
        lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("4");
        lst.add("5");

		/*
         * Please note that primitive values can not be added into LinkedList directly.
		 * They must be converted to their corresponding wrapper class ("Boxed").
		 */

        System.out.println("Print the list: \t\t" + lst);
        System.out.println(".size(): \t\t\t\t" + lst.size());
        System.out.println(".get(3): \t\t\t\t" + lst.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t\t" + lst.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t\t\t" + lst.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".size(): \t\t\t\t" + lst.size());
        System.out.println("Print again: \t" + lst);
    }
}