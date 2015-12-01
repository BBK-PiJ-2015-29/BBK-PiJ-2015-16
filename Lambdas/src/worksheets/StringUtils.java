package worksheets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {
	private StringUtils() {
	} // Uninstantiable class

	public static int eChecker(String s1, String s2) {
		int compareFlag = 0;
		if (s1.contains("e") && !s2.contains("e")) {
			compareFlag = -1;
		} else if (s2.contains("e") && !s1.contains("e")) {
			compareFlag = 1;
		}
		return (compareFlag);
	}

	public static String betterString(String s1, String s2,
			TwoStringPredicate tester) {
		if (tester.isBetter(s1, s2)) {
			return (s1);
		} else {
			return (s2);
		}
	}

	public static List<String> allMatches(List<String> candidates,
			Predicate<String> matchFunction) {
		List<String> results = new ArrayList<>();
		for (String possibleMatch : candidates) {
			if (matchFunction.test(possibleMatch)) {
				results.add(possibleMatch);
			}
		}
		return (results);
	}

	public static List<String> transformedList(List<String> originals,
			Function<String, String> transformer) {
		List<String> results = new ArrayList<>();
		for (String original : originals) {
			results.add(transformer.apply(original));
		}
		return (results);
	}

}
