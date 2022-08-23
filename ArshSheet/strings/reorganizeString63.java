package ArshSheet.strings;

import java.util.*;

public class reorganizeString63 {
    public static String reorganizeString(String s) {
        String res = "";
        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            h.put(a, h.getOrDefault(a, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(h.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        return res;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(reorganizeString(s));
    }
}
