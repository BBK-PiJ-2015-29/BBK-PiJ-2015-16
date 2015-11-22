package Ex_StringStackExamples;

/**
 * Implementation of interface stack using an array as support.
 */
public class ArrayStringStack implements StringStack {
    /**
     * The initial size of the array.
     * (Note: not size of stack, which starts at 0)
     */
    private static int INITIAL_ARRAY_SIZE = 5;
    /**
     * The array that contains the string. When full, a new one
     * is created.
     */
    private String[] stringArray;
    /**
     * The number of strings in this stack
     */
    private int size;

    public ArrayStringStack() {
        stringArray = new String[INITIAL_ARRAY_SIZE];
        size = 0;
    }

    @Override
    public void push(String newText) {
        if (isAlmostFull()) {
            reserveMoreMemory();
        }
        stringArray[size] = newText;
        size++;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        size--;
        String result = stringArray[size];
        stringArray[size] = null;
        return result;
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stringArray[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true is the size of the stack is almost
     * the same as the size of the array, false otherwise.
     */
    private boolean isAlmostFull() {
        return (stringArray.length - size < 1);
    }

    /**
     * Creates a new array twice as big, copies all elements
     * from the old array into it, and then replaces the old
     * array with the new array.
     * <p/>
     * The old array is not pointed to by anyone, so it will
     * be disposed of by the gargabe collector.
     */
    private void reserveMoreMemory() {
        String[] biggerArray = new String[size * 2];
        for (int i = 0; i < size; i++) {
            biggerArray[i] = this.stringArray[i];
        }
        this.stringArray = biggerArray;
    }
}