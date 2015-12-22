package tdd;

import java.util.EmptyStackException;

public interface Stack {
    void push(Object obj);

    Object pop() throws EmptyStackException;

    Object peek() throws EmptyStackException;

    boolean isEmpty();
}
