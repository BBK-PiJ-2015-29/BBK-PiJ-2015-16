package anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        Anagram a = new Anagram();
        a.launch();
    }

    public void launch() {
        List<String> resultList = new ArrayList<>();
        resultList = makeAnagrams("Xabc");
        System.out.println("===");
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(i + ": " + resultList.get(i));
        }
    }

    public List<String> makeAnagrams(String word) {
        System.out.println("makeAnagrams(" + word + ")...");
        List<String> result = new ArrayList<String>();
        int wl = word.length();
        System.out.println("Test Base Case");
        if (wl < 2) {
            result.add(word);
            System.out.println("--> " + word);
            return result;
        }
        String head = word.substring(0, 1);
        String rest = word.substring(1, wl);
        List<String> anagramList = makeAnagrams(rest);

        for (String restStr : anagramList) {
            System.out.println(">" + restStr);
            int n = restStr.length();
            for (int i = 0; i <= n; i++) {
                String ana = restStr.substring(0, i) + head + restStr.substring(i, n);
                result.add(ana);
            }
        }
        return result;
    }

}


	

