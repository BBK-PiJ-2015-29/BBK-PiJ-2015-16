package tdd;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackImpl implements Stack {

    private List al = new ArrayList();

    @Override
    public void push(Object obj) {
        al.add(obj);
    }

    @Override
    public Object pop() throws EmptyStackException {
        if (! isEmpty()){
            return al.remove(al.size()-1);
        }  else
            throw new EmptyStackException();
    }

    @Override
    public Object peek() throws EmptyStackException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return al.size() == 0;
    }
}
