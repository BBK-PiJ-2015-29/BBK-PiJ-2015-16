package LL;

public class LLTest {
    public static void main(String[] args) {
    /* create two empty lists, make sure they print out correctly */
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        System.out.println("list1 = '" + list1 + "', list2 = '" + list2 + "'");
        System.out.println("list1.size() = " + list1.size() +
                ", list2.size() = " + list2.size());

	/* insert some items, keep checking */
        list1.add("hello");
        list1.add("world");
        list2.add("foo");
        list2.add("bar");
        list2.add("baz");
        System.out.println("list1 = '" + list1 + "', list2 = '" + list2 + "'");
        System.out.println("list1.size() = " + list1.size() +
                ", list2.size() = " + list2.size());

	/* remove an item at an invalid position */
        try {
            list2.remove(4);
            System.out.println("error: no exception for invalid remove");
            System.out.println("list1 = '" + list1 +
                    "', list2 = '" + list2 + "'");
        } catch (Exception e) {
            System.err.println("An error occurred...");
        }
        System.out.println("list1 = '" + list1 + "', list2 = '" + list2 + "'");

	/* remove some items at valid positions */
        try {
            list1.remove(1);
            System.out.println("list1 = '" + list1 +
                    "', list2 = '" + list2 + "'");
            list2.remove(2);
            System.out.println("list1 = '" + list1 +
                    "', list2 = '" + list2 + "'");
            list2.remove(2);
            System.out.println("list1 = '" + list1 +
                    "', list2 = '" + list2 + "'");
        } catch (Exception e) {
            System.out.println("caught unexpected exception " + e +
                    ", list1 = '" + list1 + ", list2 = " + list2);
        }
        System.out.println("list1.size() = " + list1.size() +
                ", list2.size() = " + list2.size());
    }
}
