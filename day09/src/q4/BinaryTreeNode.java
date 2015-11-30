package q4;

public class BinaryTreeNode {

    private String value;
    private BinaryTreeNode left, right;

    public BinaryTreeNode(String input) {
        value = input;
    }

    public static BinaryTreeNode toTree(String input) {
        int bracketCount = 0;
        boolean hasBracket = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                bracketCount++;
                hasBracket = true;
            } else if (input.charAt(i) == ')') bracketCount--;
            else if (bracketCount == 0 && (input.charAt(i) == '*' || input.charAt(i) == '/')) {
                BinaryTreeNode tree = new BinaryTreeNode("" + input.charAt(i));
                tree.setLeft(BinaryTreeNode.toTree(input.substring(0, i)));
                tree.setRight(BinaryTreeNode.toTree(input.substring(i + 1)));
                return tree;
            }
        }

        bracketCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') bracketCount++;
            else if (input.charAt(i) == ')') bracketCount--;
            else if (bracketCount == 0 && (input.charAt(i) == '+' || input.charAt(i) == '-')) {
                BinaryTreeNode tree = new BinaryTreeNode("" + input.charAt(i));
                tree.setLeft(BinaryTreeNode.toTree(input.substring(0, i)));
                tree.setRight(BinaryTreeNode.toTree(input.substring(i + 1)));
                return tree;
            }
        }

        if (hasBracket) {
            int firstBracket = -1, lastBracket = -1;
            for (int i = 0; i < input.length(); i++) {
                if (firstBracket == -1 && input.charAt(i) == '(') firstBracket = i;
                if (lastBracket == -1 && input.charAt(input.length() - 1 - i) == ')')
                    lastBracket = input.length() - 1 - i;
            }

            return BinaryTreeNode.toTree(input.substring(firstBracket + 1, lastBracket));
        }

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') output += input.charAt(i);
        }

        return new BinaryTreeNode(output);
    }

    public void add(String input) {

    }

    public String getValue() {
        return value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode input) {
        left = input;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode input) {
        right = input;
    }

    public String toString() {
        return "[" + value + (left != null ? " " + left.toString() : "") + (right != null ? " " + right.toString() : "") + "]";
    }

}
