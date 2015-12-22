package tdd;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new StackImpl();

        String s = "first";

        stack.push("fred");
        if (stack.isEmpty()){
            System.err.println("Shouldn't be empty");
        }

        stack.push(s);
        if (!s.equals(stack.pop())) {
            System.err.println("Ouch - pop didn't work");
        }

        try {  // testing an empty stack
            stack.pop();
            System.err.println("Didn't throw the exception!");
        } catch (Exception ex) {
        }
    }
}