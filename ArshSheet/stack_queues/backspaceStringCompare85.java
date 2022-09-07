package ArshSheet.stack_queues;

import java.util.Stack;

public class backspaceStringCompare85 {
    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1, back;
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                back += S.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                back += T.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }

    public static boolean backspaceCompareStack(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#' && !s1.isEmpty()) {
                s1.pop();
            } else {
                s1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' && !s2.isEmpty()) {
                s2.pop();
            } else {
                s2.push(T.charAt(i));
            }
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxo#j##tw";
        System.out.println(backspaceCompare(s, t));
        System.out.println(backspaceCompareStack(s, t));
    }
}
