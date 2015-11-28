package q1_2;

public class IntegerTreeNode {

    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    //constructor
    public IntegerTreeNode() {
        left = null;
        right = null;
    }

    //setter
    public IntegerTreeNode(int value) {
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
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
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
            return this.value;
        } else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    @Override
    public String toString() {

        String result;
        result = "";
        result = result + "[" + Integer.toString(this.value) + " ";

        if (this.left == null) {
            result = result + "L[]";
        } else {
            result = result + "L" + this.left.toString();
        }
        if (this.right == null) {
            result = result + " R[]";
        } else {
            result = result + " R" + this.right.toString();
        }
        result = result + "]";
        return result;
    }


    public String toSimpleString() {

        String result = "";
        result = result + "[" + Integer.toString(this.value) + "";
        if (this.left != null) {
            result = result + " " + this.left.toSimpleString();
        }
        if (this.right != null) {
            result = result + this.right.toSimpleString();
        }
        result = result + "]";
        return result;
    }


}