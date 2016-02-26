package q7b;

public class SelfSortingListTest {

    public static void main(String[] args) {
        SelfSortingList ssl = new SelfSortingList();

        ssl.add(90);
        ssl.add(20);
        ssl.add(40);
        ssl.add(10);
        ssl.add(80);
        ssl.add(60);
        ssl.add(70);
        ssl.printList();

        boolean done = false;
        while (!done) {
            ssl.printList();
            System.out.println("Enter(or q)");
            String str = System.console().readLine();
            System.out.println();
            if (!str.equals("q")) {
                int i = Integer.parseInt(str);
                ssl.add(i);
            } else {
                done = true;
                ssl.printList();
            }
        }
    }
}	



