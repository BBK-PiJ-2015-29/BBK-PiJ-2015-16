public class ArrayTest {
    public static void main(String[] arguments) {

        Stack<Integer> stack = new ArrayStack<>();

        //test empty
        System.out.println(stack.empty());

        //make Stack of Integers
        //test push, peek, pop
        //MAX number of integers on stack
        final Integer MAX = new Integer(100);
        System.out.println("push on stack");
        for (Integer i = 1; i <= MAX; i++) {
            stack.push(i);
            System.out.println(stack.peek());
        }

        System.out.println(stack.empty());
        System.out.println("pop off stack");
        for (Integer i = 1; i <= MAX; i++) {
            Integer x = stack.pop();
            System.out.println(x);
        }

        //test exceptions
        try {
            stack.pop();
        } catch (Exception exception) {
            System.out.println(exception);
        }
        try {
            stack.peek();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        //make an Stack of Strings
        Stack<String> stack2
                = new ArrayStack<>();
        stack2.push("A");
        stack2.push("B");
        stack2.push("C");
        stack2.push("D");
        System.out.println("Top of stack is: " + stack2.peek());
        String letter = stack2.pop();
        System.out.println("Pop off element: " + letter);
        letter = stack2.pop();
        System.out.println("Pop off element: " + letter);
        letter = stack2.pop();
        System.out.println("Pop off element: " + letter);
        stack2.push("E");
        stack2.push("F");
        System.out.println("Top of stack is: " + stack2.peek());
        System.out.println();
    }
}