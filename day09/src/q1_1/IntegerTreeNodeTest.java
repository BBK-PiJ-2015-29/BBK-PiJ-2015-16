package q1_1;

public class IntegerTreeNodeTest {

    public static void main(String[] args) {
        IntegerTreeNodeTest ts = new IntegerTreeNodeTest();
        ts.launch();
    }

    public void launch() {
        // add integers to tree
        IntegerTreeNode itn = new IntegerTreeNode(10);
        itn.add(3);
        itn.add(11);
        itn.add(15);
        itn.add(8);
        itn.add(44);
        itn.add(7);
        // check if an int n is present in the tree
        int n = 8;
        if (itn.contains(n)) {
            System.out.println("The tree has:  " + n);
        } else {
            System.out.println("Does not have: " + n);
        }
        // print max and min values in the tree
        System.out.println("Max is: " + itn.getMax());
        System.out.println("Min is: " + itn.getMin());
    }


}