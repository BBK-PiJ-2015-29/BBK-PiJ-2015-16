package q1_3;

public class IntegerTreeNode {

    private IntegerTreeNode left;
    private int value;
    private IntegerTreeNode right;

    public IntegerTreeNode() {
        left = null;
        value = 0;
        right = null;
    }

    public IntegerTreeNode(int value) {
        this();
        this.value = value;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == value) {
            return true;
        } else if (n > value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public int getMax() {
        if (right == null) {
            return value;
        } else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return value;
        } else {
            return left.getMin();
        }
    }

    @Override
    public String toString() {


        StringBuilder result = new StringBuilder();

        result.append("[" + Integer.toString(value) + " ");

        if (left == null) {
            result.append("L[]");
        } else {
            result.append("L" + left.toString());
        }
        if (right == null) {
            result.append(" R[]");
        } else {
            result.append(" R" + right.toString());
        }
        result.append("]");
        return result.toString();
    }

    public String toSimpleString() {
        StringBuilder result = new StringBuilder();
        result.append("[" + Integer.toString(this.value));
        if (left != null) {
            result.append(" " + left.toSimpleString());
        }
        if (right != null) {
            result.append(right.toSimpleString());
        }
        result.append("]");
        return result.toString();
    }

    public int depth() {

        int ldeep = 0;
        int rdeep = 0;

        if (left != null) {
            ldeep = 1 + left.depth();
        }
        if (right != null) {
            rdeep = 1 + right.depth();
        }

        System.out.println("LD: " + ldeep + " RD: " + rdeep);
        if (ldeep > rdeep) {
            return ldeep;
        } else {
            return rdeep;
        }
    }

}



























