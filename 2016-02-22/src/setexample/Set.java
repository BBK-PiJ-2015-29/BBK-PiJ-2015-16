package setexample;

import java.util.List;

interface Set<T> {
    Set add(T elt);

    Set remove(T elt);

    int size();

    Boolean contains(T elt);

    Boolean subset(Set<T> otherset);

    List<T> getElements();
}

