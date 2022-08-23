package LeetCodeContests;

public class biWeekly85_3 {
    /*
     * 6158. Shifting Letters II
     * You are given a string s of lowercase English letters and a 2D integer array
     * shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the
     * characters in s from the index starti to the index endi (inclusive) forward
     * if directioni = 1, or shift the characters backward if directioni = 0.
     * 
     * Shifting a character forward means replacing it with the next letter in the
     * alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a
     * character backward means replacing it with the previous letter in the
     * alphabet (wrapping around so that 'a' becomes 'z').
     * 
     * Return the final string after all such shifts to s are applied.
     */
    public static String shiftingLetters(String s, int[][] shifts) {
        char[] news = s.toCharArray();
        for (int i = 0; i < shifts.length; i++) {
            int j = shifts[i][0], k = shifts[i][1], type = shifts[i][2];
            while (j <= k) {
                if (type == 0) {
                    news[j] = (char) ((s.charAt(j) + 'z') % 26);
                } else {
                    news[j] = (char) ((s.charAt(j) + 'a') % 26);
                }
            }
        }
        System.out.println("cal");
        return news.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };
        System.out.println(shiftingLetters(s, shifts));
    }
}
