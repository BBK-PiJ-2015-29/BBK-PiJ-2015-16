// An ArrayIntList stores an ordered list of integers.

package example;

import java.util.Arrays;

public class ArrayIntList implements IntList {
    public static final int DEFAULT_CAPACITY = 10;
    private int size;
    private int[] elementData;

    // Initializes a new empty list with the default capacity.
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // Initializes a new empty list with the specified initial capacity.
    // Pre: capacity > 0, throws IllegalArgumentException otherwise
    public ArrayIntList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive: " + capacity);
        }
        size = 0; // optional; size is initialized to 0 by default
        elementData = new int[capacity];
    }

    // Returns the number of elements in the list.
    public int size() {
        return size;
    }

    // Returns true if the list does not contain any elements.
    public boolean isEmpty() {
        return size == 0; // "boolean zen"
    }

    // Adds the given value to the end of the list.
    public void add(int value) {
        add(size, value);
    }

    // Inserts the given value into the list at the given index.
    // Pre: 0 <= index <= size, throws IndexOutOfBoundsException otherwise
    public void add(int index, int value) {
        checkIndex(index, 0, size); // ok to add at size (end of list)
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // Removes the value at the given index.
    // Pre: 0 <= index < size, throws IndexOutOfBoundsException otherwise
    public void remove(int index) {
        checkIndex(index, 0, size - 1);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // Returns the value at the given index.
    // Pre: 0 <= index < size, throws IndexOutOfBoundsException otherwise
    public int get(int index) {
        checkIndex(index, 0, size - 1);
        return elementData[index];
    }

    // Sets the given index to store the given value.
    // Pre: 0 <= index < size, throws IndexOutOfBoundsException otherwise
    public void set(int index, int value) {
        checkIndex(index, 0, size - 1);
        elementData[index] = value;
    }

    // Returns a String representation of the list consisting of the elements
    // in order, separated by commas and enclosed in square brackets.
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // Increases the capacity if needed to ensure that it can hold at
    // least the number of elements specified.
    // Post: elementData.length >= capacity
    public void ensureCapacity(int capacity) {
        // double in size until large enough
        while (capacity > elementData.length) {
            elementData = Arrays.copyOf(elementData, 2 * elementData.length);
        }
    }

    // If the given index is outside of the given bounds, throws an
    // IndexOutOfBoundsException.
    private void checkIndex(int index, int min, int max) {
        if (index < min || index > max) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

}
