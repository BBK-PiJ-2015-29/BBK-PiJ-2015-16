package bigfour;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericImpl<T extends Comparable<? super T>> implements Generic<T> {

    private List<T> l;

    public GenericImpl() {
        l = new LinkedList<T>();
    }

    @Override
    public void add(T item) {
        l.add(item);
    }

    @Override
    public Optional<T> find(Predicate<T> p) {
        for (T ele : l) {
            if (p.test(ele)) {
                return Optional.of(ele);
            }
        }
        return Optional.empty();
    }
}
