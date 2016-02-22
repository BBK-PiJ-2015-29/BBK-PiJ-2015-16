package q5;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Some String-specific versions of methods that transform Lists. See
 * ElementUtils for the better, generically-typed versions.
 */

public class StringUtils {
    private StringUtils() {
    }

    public static List<String> allMatches(List<String> candidates,
                                          Predicate<String> matchFunction) {
        return candidates.stream().filter(matchFunction::test).collect(Collectors.toList());
//        List<String> results = new ArrayList<>();
//        for (String possibleMatch : candidates) {
//            if (matchFunction.test(possibleMatch)) {
//                results.add(possibleMatch);
//            }
//        }
    }

    public static List<String> transformedList(List<String> originals,
                                               Function<String, String> transformer) {
        return originals.stream().map((t) -> transformer.apply(t)).collect(Collectors.toList());

//        List<String> results = new ArrayList<>();
//        for (String original : originals) {
//            results.add(transformer.apply(original));
//        }
    }
}
