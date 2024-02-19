import java.util.HashMap;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length(), tl = t.length();
        if (s == null || t == null || sl != tl)
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < sl; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Integer val : hm.values()) {
            if (val != 0)
                return false;
        }
        return true;
    }
}
// @lc code=end
