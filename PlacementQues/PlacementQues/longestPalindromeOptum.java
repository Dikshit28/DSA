package PlacementQues;

//Considers each element as center for palindrome
public class longestPalindromeOptum {
    public static String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        char[] array = s.toCharArray();
        int start = 0, end = 0;
        for (int i = 0; i < array.length; i++) {
            int len = Math.max(expand(array, i, i), expand(array, i, i + 1));
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expand(char[] array, int i, int j) {
        while (i >= 0 && j < array.length && array[i] == array[j]) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        String s = "cababacd";
        System.out.println(longestPalindrome(s));
    }
}
