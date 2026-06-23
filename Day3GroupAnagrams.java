import java.util.*;

public class Day3GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "ate", "tan", "nat", "bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        System.out.println(map.values());
    }
}
