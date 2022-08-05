package ArshSheet.strings;

public class needlehaystack26 {
    public static int strstr(String needle, String haystack) {
        int nl = needle.length();
        int hl = haystack.length();
        if (nl == 0) {
            return 0;
        }
        for (int i = 0; i < hl - nl + 1; i++) {
            String word = haystack.substring(i, i + nl);
            if (word.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public int strstroptimal(String haystack, String needle) {
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (needle.charAt(j) != haystack.charAt(i + j))
                    break;
            }
        }
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        System.out.println(strstr(needle, haystack));
    }
}
