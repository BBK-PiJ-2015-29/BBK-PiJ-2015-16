import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odd {
  private static List<Integer> strange(List<Integer> list) {
    List<Integer> res = new ArrayList<>();
    list.stream().forEach(i -> res.add(i));

    for (int i = list.size() - 1; i >= 0; i--) {
      if (i % 2 == 0) {
        res.add(list.get(i));
      } else {
        res.add(0, list.get(i));
      }
    }
    return res;
  }

  private static <T> void sop(List<T> arg){
    System.out.println(arg);
  }

  public static void main(String[] args) {
    sop(strange(Arrays.asList(10, 20, 30)));
    sop(strange(Arrays.asList(8, 2, 9, 7, 4)));
    sop(strange(Arrays.asList()));
    sop(strange(Arrays.asList(33, -1, 3, 17, -1, 11)));
  }
}
