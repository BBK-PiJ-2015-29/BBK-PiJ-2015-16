package q12cocktailsort;

public class RaceToSort {
    private Node listStartSL = null;
    private DoubleLinkNode listStartDL = null;

    public static void main(String[] args) {
        RaceToSort test = new RaceToSort();
        test.launch();
    }

    private void launch() {
        int size = 50000;
        int[] intArray;
        intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = (int) Math.abs(100000 * Math.random());
        }
        System.out.println();

        //SINGLE LINKED

        listStartSL = ListUtilities.intArrayToList(intArray);
        System.out.println("SINGLE LINKED Before sorting: ");
        listStartSL.printList();

        //DOUBLE LINKED

        listStartDL = ListUtilities.intArrayToDoubleLinkList(intArray);
        System.out.println("DOUBLE LINKED Before sorting: ");
        listStartDL.printList();

        //SINGLE LINKED
        //sort the list

        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        listStartSL = ListUtilities.bubbleSort(listStartSL);
        long stop = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        long bubbleTime = stop - start;
        System.out.println("BUBBLE TIME = " + bubbleTime);

        //print the list
        System.out.println("After sorting: ");
        listStartSL.printList();

        //DOUBLE LINKED
        //sort the list
        System.out.println(System.currentTimeMillis());
        start = System.currentTimeMillis();
        listStartDL = ListUtilities.cocktailSort(listStartDL);
        stop = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        long cocktailTime = stop - start;
        System.out.println("COCKTAIL TIME = " + cocktailTime);
        System.out.println("After sorting: ");
        listStartDL.printList();
    }
}	