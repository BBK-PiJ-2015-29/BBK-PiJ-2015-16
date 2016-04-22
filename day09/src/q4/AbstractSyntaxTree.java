package q4;

public class AbstractSyntaxTree {

    public static void main(String[] args) {
        System.out.println(BinaryTreeNode.toTree("(3 + 4) / (7 * 4 + 3)"));
        System.out.println(BinaryTreeNode.toTree("(3 + 3) * (8 - 11 * 2)"));
    }
}
