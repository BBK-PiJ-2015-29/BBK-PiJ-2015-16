package q3_2;

public class TreeIntSortedListTest {

    public static void main(String[] args) {
        TreeIntSortedList tisl = new TreeIntSortedList(50);
        tisl.add(40);
        tisl.add(30);
        tisl.add(60);
        tisl.add(20);
        tisl.add(70);
        tisl.add(80);
        tisl.add(10);
        tisl.add(90);
        tisl.add(5);


        System.out.println("=== PRINT LIST ===");
        System.out.println(tisl);
        System.out.println();

        System.out.println("=== CHECK FOR CONTAINS ===");
        System.out.println("contains 30: " + tisl.contains(30));
        System.out.println("contains 35: " + tisl.contains(35));


        System.out.println("=== TRY ADDING DUPLICATES 30, 60, 20 ===");
        tisl.add(30);
        tisl.add(60);
        tisl.add(20);

        System.out.println();
        System.out.println("=== PRINT LIST ===");
        System.out.println(tisl);
        System.out.println();


    }
}