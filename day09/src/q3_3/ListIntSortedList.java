package q3_3;

public class ListIntSortedList implements IntSortedList {

    private int value;
    private ListIntSortedList nextNode;

    public ListIntSortedList(int value) {
        this.value = value;
        this.nextNode = null;
    }

    /**
     * Adds a new int to the list so that the list remains sorted;
     * a list can contain duplicates unlike a set.
     */
    @Override
    public void add(int newNumber) {

        ListIntSortedList insertNode = new ListIntSortedList(newNumber);
        ListIntSortedList currentNode = this;
        //it goes at the front
        if (currentNode.value > newNumber) {
            int temp = currentNode.value;
            currentNode.value = newNumber;
            insertNode.value = temp;
            insertNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = insertNode;
            return;
        }

        // look for slot
        while (currentNode.nextNode != null) {
            if (newNumber <= currentNode.nextNode.value) {
                insertNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = insertNode;
                return;
            }
            currentNode = currentNode.nextNode;
        }

        //got to the end...currentNode.nextNode is null...
        if (newNumber < currentNode.value) {
            int temp = currentNode.value;
            currentNode.value = newNumber;
            currentNode.nextNode = insertNode;
            insertNode.value = temp;
        } else {
            currentNode.nextNode = insertNode;
        }
        return;
    }

    /**
     * returns true if the number is in the list, false otherwise
     */
    @Override
    public boolean contains(int checkNumber) {
        if (this.value == checkNumber) {
            return true;
        } else if (this.nextNode != null) {
            return this.nextNode.contains(checkNumber);
        }
        return false;
    }

    /**
     * returns a string with the values of the elements int he list separated by commas
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(value + ", ");
        ListIntSortedList currentNode = this.nextNode;
        while (currentNode.nextNode != null) {
            result.append(currentNode.value + ", ");
            currentNode = currentNode.nextNode;
        }
        result.append(currentNode.value + ".");
        return result.toString();
    }
}