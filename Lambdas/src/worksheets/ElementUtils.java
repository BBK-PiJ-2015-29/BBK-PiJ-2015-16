package worksheets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtils {
	// Uninstantiatable class
	private ElementUtils() {
	}

	public static <T> T betterElement(T element1, T element2,
			TwoElementPredicate<T> tester) {
		if (tester.isBetter(element1, element2)) {
			return (element1);
		} else {
			return (element2);
		}
	}

	public static <T> List<T> allMatches(List<T> candidates,
			Predicate<T> matchFunction) {
		List<T> results = new ArrayList<>();
		for (T possibleMatch : candidates) {
			if (matchFunction.test(possibleMatch)) {
				results.add(possibleMatch);
			}
		}
		return (results);
	}

	public static <T, R> List<R> transformedList(List<T> originals,
			Function<T, R> transformer) {
		List<R> results = new ArrayList<>();
		for (T original : originals) {
			results.add(transformer.apply(original));
		}
		return (results);
	}
}