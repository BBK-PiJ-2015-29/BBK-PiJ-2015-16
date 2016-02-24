package setexample;

import java.util.ArrayList;
import java.util.List;

// Appalling code as memory leaks all over the place but that is not the object of the exercise

public class MySet<T> implements Set<T> {
    private List<T> elements;

    public MySet() {
        elements = new ArrayList<T>();
    }

    @Override
    public Set add(T elt) {
        if (!contains(elt))
            elements.add(elt);
        return this;
    }

    @Override
    public Set remove(T elt) {
        if (contains(elt))
            elements.remove(elt);
        return this;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public Boolean contains(T elt) {
        return elements.contains(elt);
    }

    //rubbish but I don't have to do this properly
    @Override
    public Boolean subset(Set<T> otherset) {
        List<T> temp = otherset.getElements();
        for (T item : temp)
            if (!elements.contains(item))
                return false;
        return true;
    }

    @Override
    public List<T> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (T item : elements) {
            sb.append(item);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}

