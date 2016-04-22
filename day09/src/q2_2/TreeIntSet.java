package q2_2;

public class TreeIntSet implements IntSet {

    private int value;
    private TreeIntSet left;
    private TreeIntSet right;

    public TreeIntSet() {
        left = null;
        right = null;
    }

    public TreeIntSet(int value) {
        this.value = value;
    }

    @Override
    public void add(int newNumber) {

        if (!contains(newNumber)) {
            if (newNumber < this.value) {
                if (left == null) {
                    left = new TreeIntSet(newNumber);
                } else {
                    left.add(newNumber);
                }
            } else {
                if (right == null) {
                    right = new TreeIntSet(newNumber);
                } else {
                    right.add(newNumber);
                }
            }
        } else {
            System.out.println("already there");
        }
    }

    @Override
    public boolean contains(int checkNumber) {
        if (checkNumber == this.value) {
            return true;
        } else {
            if (checkNumber < this.value) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(checkNumber);
                }
            } else {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(checkNumber);
                }
            }
        }
    }

    @Override
    public boolean containsVerbose(int checkNumber) {
        System.out.print("> " + this.value + " ");
        if (checkNumber == this.value) {
            return true;
        } else {
            if (checkNumber > this.value) {
                if (right == null) {
                    return false;
                } else {
                    return right.containsVerbose(checkNumber);
                }
            } else {
                if (left == null) {
                    return false;
                } else {
                    return left.containsVerbose(checkNumber);
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        result = result + Integer.toString(this.value);

        if (this.left != null) {
            result = result + ", " + this.left.toString();
        }
        if (this.right != null) {
            result = result + ", " + this.right.toString();
        }
        return result;
    }

}































