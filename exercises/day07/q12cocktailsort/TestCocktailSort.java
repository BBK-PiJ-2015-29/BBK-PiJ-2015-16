package q12cocktailsort;

public class TestCocktailSort {

    private DoubleLinkNode listStart = null;

    public static void main(String[] args) {
        TestCocktailSort test = new TestCocktailSort();
        test.launch();
    }

    private void launch() {
        int[] intArray = {99, 11, 12, 100, 90, 30, 40, 99, 60, 35, 10, 75, 11, 2, 1};
        listStart = ListUtilities.intArrayToDoubleLinkList(intArray);

        System.out.println("Before sorting: ");
        listStart.printList();

        //sort the list
        listStart = ListUtilities.cocktailSort(listStart);

        System.out.println("After sorting: ");
        listStart.printList();
    }
}	