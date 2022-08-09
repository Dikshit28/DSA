package ArshSheet.strings;

import java.util.*;

public class generateParentheses30 {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> res = generateParenthesis(n);
        System.out.println(res);
    }
}
