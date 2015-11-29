package q3_2;

import q3_1.IntSortedList;

public class TreeIntSortedList implements IntSortedList {
    private TreeIntSortedList left;
    private int value;
    private TreeIntSortedList right;

    public TreeIntSortedList(int value) {
        this.left = null;
        this.value = value;
        this.right = null;
    }

    @Override
    public void add(int newNumber) {
        if (newNumber < value) {
            if (left == null) {
                left = new TreeIntSortedList(newNumber);
            } else {
                left.add(newNumber);
            }
        } else {
            if (right == null) {
                right = new TreeIntSortedList(newNumber);
            } else {
                right.add(newNumber);
            }
        }
    }

    @Override
    public boolean contains(int checkNumber) {
        if (checkNumber == value) {
            return true;
        }
        if (left != null) {
            return left.contains(checkNumber);
        }
        if (right != null) {
            return right.contains(checkNumber);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        if (left != null) {
            result.append(left.toString());   // recursive call
        }
        result.append(value + ", ");
        if (right != null) {
            result.append(right.toString());  // ditto
        }
        return result.toString();
    }
}