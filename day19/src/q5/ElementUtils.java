package q5;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Some generically-typed versions of methods that transform Lists. See
 * StringUtils for the less flexible String-specific versions.
 */

public class ElementUtils {
    private ElementUtils() {
    }

    public static <T> List<T> allMatches(List<T> candidates,
                                         Predicate<T> matchFunction) {
        return candidates.stream().filter(possibleMatch
                -> matchFunction.test(possibleMatch)).collect(Collectors.toList());
//        List<T> results = new ArrayList<>();
//        for (T possibleMatch : candidates) {
//            if (matchFunction.test(possibleMatch)) {
//                results.add(possibleMatch);
//            }
//        }
//        return results;
    }

    public static <T, R> List<R> transformedList(List<T> originals,
                                                 Function<T, R> transformer) {
        return originals.stream().map(transformer::apply).collect(Collectors.toList());
    }
}
