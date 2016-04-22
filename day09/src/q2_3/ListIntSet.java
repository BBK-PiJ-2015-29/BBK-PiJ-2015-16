package q2_3;

public class ListIntSet implements IntSet {

    private int value;
    private ListIntSet nextListIntSet;

    //constructor
    public ListIntSet(int value) {
        this.value = value;
        this.nextListIntSet = null;
    }

    @Override
    public void add(int newNumber) {
        if (!contains(newNumber)) {
            ListIntSet insertNode = new ListIntSet(newNumber);
            if (this.nextListIntSet == null) {
                this.nextListIntSet = insertNode;
                return;
            }
            ListIntSet currentNode = this.nextListIntSet;
            while (currentNode.nextListIntSet != null) {
                currentNode = currentNode.nextListIntSet;
            }
            currentNode.nextListIntSet = insertNode;
        }
    }

    @Override
    public boolean contains(int checkNumber) {
        if (this.value == checkNumber) {
            return true;
        }
        if (this.nextListIntSet != null) {
            return this.nextListIntSet.contains(checkNumber);
        }
        return false;
    }

    @Override
    public boolean containsVerbose(int checkNumber) {

        System.out.print(this.value);
        if (this.value == checkNumber) {
            System.out.print(". ");
            return true;
        }
        if (this.nextListIntSet != null) {
            System.out.print(", ");
            return this.nextListIntSet.containsVerbose(checkNumber);
        }
        System.out.print(". ");
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("" + this.value);
        if (this.nextListIntSet == null) {
            return result.toString();
        }
        ListIntSet currentNode = this.nextListIntSet;
        while (currentNode.nextListIntSet != null) {
            result.append(", " + currentNode.value);
            currentNode = currentNode.nextListIntSet;
        }
        result.append(", " + currentNode.value);
        return result.toString();
    }
}