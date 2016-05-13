import java.util.*;

public class M {
  public static void main(String[] args) {

    m(toMap(Arrays.asList("sheep", "wool", "house", "brick",
      "cast", "plaster", "wool", "wool")));
    m(toMap(Arrays.asList("munchkin", "blue", "winkie", "yellow",
      "corn", "yellow", "grass", "green", "emerald", "green")));
    m(toMap(Arrays.asList("pumpkin", "peach", "corn", "apple",
      "apple", "apple", "pie", "fruit", "peach", "peach")));
    m(toMap(Arrays.asList("lab", "MAL", "lion", "cat", "terrier",
      "dog", "cat", "cat", "platypus", "animal", "nyan", "cat")));
  }

  public static void m(Map<String, String> m) {
    Set<String> s = new TreeSet<>();
    for (String key : m.keySet()) {
      if (!m.get(key).equals(key)) {
        s.add(m.get(key));
      } else {
        s.remove(m.get(key));
      }
    }
    System.out.println(s);
  }

  private static Map<String, String> toMap(List<String> lst) {
    Map<String, String> map = new HashMap<>();
    for (int x = 0; x < lst.size(); x = x + 2) {
      map.put(lst.get(x), lst.get(x + 1));
    }
    return map;
  }
}
