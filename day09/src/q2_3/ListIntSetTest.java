package q2_3;

public class ListIntSetTest {

    public static void main(String[] args) {
        ListIntSet tis = new ListIntSet(50);
        tis.add(40);
        tis.add(30);
        tis.add(60);
        tis.add(20);
        tis.add(70);
        tis.add(80);
        tis.add(10);
        tis.add(90);

        System.out.println();
        System.out.println();
        System.out.println("=== PRINT LIST ===");
        String result = tis.toString();
        System.out.println(result);
        System.out.println();
        System.out.println("=== Check for ===");
        System.out.println(tis.containsVerbose(20));
        System.out.println("contains 20: " + tis.contains(20));
        System.out.println(tis.containsVerbose(101));
        System.out.println("contains 101: " + tis.contains(101));

        System.out.println();
        System.out.println("=== TRY ADDING 30 ===");
        tis.add(30);
        System.out.println();
        System.out.println("=== PRINT LIST ===");
        System.out.println(tis.toString());
        System.out.println();
        System.out.println();

    }


}