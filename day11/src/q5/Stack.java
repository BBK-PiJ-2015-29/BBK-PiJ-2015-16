package q5;

public class Stack<N extends Number> {

    private N value;
    private Stack next;

    public Stack() {
        this.next = null;
    }

    public Stack(N value) {
        this.value = value;
        this.next = null;
    }

    // push, pop and isEmpty...

    public void push(N value) {
        Stack addStack = new Stack(value);
        if (this.isEmpty()) {
            this.next = addStack;
            System.out.println("Pushed: " + value);
        } else {
            this.next.push(value);
        }
    }

    public N pop() {
        if (this.next.next == null) {
            N result = (N) this.next.value;
            this.next = null;
            return result;
        } else {
            return (N) this.next.pop();
        }
    }

    public boolean isEmpty() {
        if (this.next == null) {
            return true;
        } else {
            return false;
        }
    }
}