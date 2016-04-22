package q12;

public class IntegerTreeNodeTest {

    public static void main(String[] args) {
        IntegerTreeNodeTest ts = new IntegerTreeNodeTest();
        ts.launch();
    }

    public void launch() {
        // add integers to tree
        IntegerTreeNode itn = new IntegerTreeNode(6);
        itn.add(9);
        itn.add(5);
        itn.add(3);
        itn.add(11);
        itn.add(8);
        itn.add(12);
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

        // print out the tree

        System.out.println("=== COMPLEX TREE ===");
        System.out.println();
        System.out.println(itn.toString());
        System.out.println();
        System.out.println("=== SIMPLE TREE ===");
        System.out.println(itn.toSimpleString());
        System.out.println();


    }


}