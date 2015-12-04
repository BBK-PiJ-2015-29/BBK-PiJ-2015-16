package q5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Some String-specific versions of methods that transform Lists. See
 * ElementUtils for the better, generically-typed versions.
 */

public class StringUtils {
    private StringUtils() {
    } // Uninstantiatable class

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
