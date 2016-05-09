import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RarestAge {
  public static int rarestAge(Map<String, Integer> m) {
    if (m == null || m.isEmpty()) {
      throw new IllegalArgumentException();
    }

    Map<Integer, Integer> counts = new TreeMap<>();
    for (String name : m.keySet()) {
      int age = m.get(name);
      if (counts.containsKey(age)) {
        counts.put(age, counts.get(age) + 1);
      } else {
        counts.put(age, 1);
      }
    }

    int minCount = m.size() + 1;
    int rareAge = -1;
    for (int age : counts.keySet()) {
      int count = counts.get(age);
      if (count < minCount) {
        minCount = count;
        rareAge = age;
      }
    }
    return rareAge;
  }

  public static int rarestAgeTwo(Map<String, Integer> m) {
    if (m == null || m.isEmpty()) {
      throw new IllegalArgumentException();
    }

    Map<Integer, Integer> counts = new TreeMap<>();
    for (int age : m.values()) {
      if (!counts.containsKey(age)) {
        counts.put(age, 0);
      }
      counts.put(age, counts.get(age) + 1);
    }

    int rareAge = -1;
    for (int age : counts.keySet()) {
      if (rareAge < 0 || counts.get(age) < counts.get(rareAge)) {
        rareAge = age;
      }
    }
    return rareAge;
  }

  public static int rarestAgeThree(Map<String, Integer> m) {
    if (m == null || m.isEmpty()) {
      throw new IllegalArgumentException();
    }

    Map<Integer, Integer> counts = new TreeMap<>();
    for (String name : m.keySet()) {
      if (counts.containsKey(m.get(name))) {
        counts.put(m.get(name), counts.get(m.get(name)) + 1);
      } else {
        counts.put(m.get(name), 1);
      }
    }

    int minCount = Integer.MAX_VALUE;
    // really big number to be overwritten

    for (int age : counts.keySet()) {
      minCount = Math.min(minCount, counts.get(age));
    }
    for (int age : counts.keySet()) {
      if (counts.get(age) == minCount) {
        return age;
      }
    }
    return -1;   // won't reach here
  }

  public static int rarestAgeFour(Map<String, Integer> m) {
    if (m == null || m.isEmpty()) {
      throw new IllegalArgumentException();
    }

    Map<Integer, Integer> counts = new HashMap<>();
    for (String name : m.keySet()) {
      if (!counts.containsKey(m.get(name))) {
        counts.put(m.get(name), 0);
      }
      counts.put(m.get(name), counts.get(m.get(name)) + 1);
    }

    int minCount = Integer.MAX_VALUE;
    // really big number to be overwritten

    for (int age : counts.keySet()) {
      minCount = Math.min(minCount, counts.get(age));
    }
    int rareAge = -1;
    for (int age : counts.keySet()) {
      if (counts.get(age) == minCount &&
            (rareAge < 0 || age < rareAge)) {
        rareAge = age;
      }
    }
    return rareAge;
  }
}
