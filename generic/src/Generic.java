import java.util.Optional;
import java.util.function.Predicate;

public interface Generic<T extends Comparable<? super T>> {
	void add(T item);

	Optional<T> find(Predicate<T> p);
}
