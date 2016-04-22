package q3_3;

public class ListIntSortedListTest {

    public static void main(String[] args) {

        ListIntSortedList lisl = new ListIntSortedList(10);
        lisl.add(15);
        lisl.add(30);
        lisl.add(40);
        lisl.add(36);
        lisl.add(2);
        lisl.add(80);
        lisl.add(85);
        lisl.add(90);


        System.out.println();
        System.out.println();
        System.out.println("=== PRINT LIST ===");
        String result = lisl.toString();
        System.out.println(result);
        System.out.println();

        System.out.println("=== CHECK FOR CONTAINS ===");
        System.out.println("contains 1: " + lisl.contains(1));
        System.out.println("contains 2: " + lisl.contains(2));
        System.out.println("contains 30: " + lisl.contains(30));
        System.out.println("contains 35: " + lisl.contains(35));
        System.out.println("contains 90: " + lisl.contains(90));
        System.out.println("contains 99: " + lisl.contains(99));

        System.out.println("=== TRY ADDING DUPLICATES 30, 60, 20 ===");
        lisl.add(30);
        lisl.add(60);
        lisl.add(20);
        System.out.println();
        System.out.println("=== PRINT LIST ===");
        result = lisl.toString();
        System.out.println(result);
        System.out.println();
    }
}