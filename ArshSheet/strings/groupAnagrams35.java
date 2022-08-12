package ArshSheet.strings;

import java.util.*;

public class groupAnagrams35 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s1 = strs[i];
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s1);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> out = groupAnagrams(strs);
        System.out.println(out);
    }
}
