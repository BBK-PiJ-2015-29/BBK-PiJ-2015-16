import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveBadPairs {
  public static void removeBadPairs(List<Integer> list) {
    if (list.size() % 2 != 0) {
      list.remove(list.size() - 1);
    }
    for (int i = 0; i < list.size(); i += 2) {
      if (list.get(i) > list.get(i + 1)) {
        list.remove(i);
        list.remove(i);
        i -= 2;
      }
    }
  }

  public static void removeBadPairsAgain(List<Integer> list) {
    if (list.size() % 2 != 0) {
      list.remove(list.size() - 1);
    }
    for (int i = list.size() - 1; i > 0; i--) {
      if (i % 2 != 0 && list.get(i - 1) > list.get(i)) {
        list.remove(i);
        list.remove(i - 1);
      }
    }
  }

  public static void removeBadPairsAgainAgain(List<Integer> list) {
    if (list.size() % 2 != 0) {
      list.remove(list.size() - 1);

      int limit = list.size();
      for (int i = 0; i < limit; i += 2) {
        if (list.get(i) <= list.get(i + 1)) {
          list.add(list.get(i));
          list.add(list.get(i+1));
        }
      }
      for (int i=0; i < limit; i++){
        list.remove(0);
      }
    }
  }

  public static void main(String[] args) {
    List<Integer> lst = new ArrayList(Arrays.asList(3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1));
    System.out.println(lst);
    removeBadPairsAgainAgain(lst);
    System.out.println(lst);
  }
}
