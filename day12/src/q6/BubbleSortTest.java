package q6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {


    @Test
    public void testsSortingTheListNormal() {
        int[] unsortedArray = {100, 90, 30, 40, 99, 60, 35, 10, 75, 80};
        int[] expected = {10, 30, 35, 40, 60, 75, 80, 90, 99, 100};
        Node unsortedLL = ListUtilities.intArrayToList(unsortedArray);
        Node sortedLL = ListUtilities.bubbleSort(unsortedLL);
        int[] sortedArray = new int[10];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = sortedLL.getTheNumber();
            sortedLL = sortedLL.getNextNode();
        }
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testsSortingTheListNormalUsingHelperMethod() {
        int[] unsortedArray = {100, 90, 30, 40, 99, 60, 35, 10, 75, 80};
        int[] expected = {10, 30, 35, 40, 60, 75, 80, 90, 99, 100};
        int[] sortedArray = helperMethod(unsortedArray);
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testsSortingTheListFirstNumberAlreadyLowest() {
        int[] unsortedArray = {10, 90, 30, 40, 99, 60, 35, 100, 75, 80};
        int[] expected = {10, 30, 35, 40, 60, 75, 80, 90, 99, 100};
        int[] sortedArray = helperMethod(unsortedArray);
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testsSortingTheListLastNumberLowest() {
        int[] unsortedArray = {80, 90, 30, 40, 99, 60, 35, 100, 75, 10};
        int[] expected = {10, 30, 35, 40, 60, 75, 80, 90, 99, 100};
        int[] sortedArray = helperMethod(unsortedArray);
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testsSortingTheListTwoNumbersEqual() {
        int[] unsortedArray = {80, 90, 30, 40, 99, 60, 30, 100, 75, 10};
        int[] expected = {10, 30, 30, 40, 60, 75, 80, 90, 99, 100};
        int[] sortedArray = helperMethod(unsortedArray);
        assertArrayEquals(expected, sortedArray);
    }

    private int[] helperMethod(int[] unsortedArray) {
        Node unsortedLL = ListUtilities.intArrayToList(unsortedArray);
        Node sortedLL = ListUtilities.bubbleSort(unsortedLL);
        int[] sortedArray = new int[10];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = sortedLL.getTheNumber();
            sortedLL = sortedLL.getNextNode();
        }
        return sortedArray;
    }
}















