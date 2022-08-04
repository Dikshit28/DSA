package ArshSheet.strings;

public class validParenthesis24 {
    public static boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                arr[count] = s.charAt(i);
                count++;
            } else if (count < 1) {
                return false;
            } else {
                if (s.charAt(i) == ')') {
                    if (arr[count - 1] != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (arr[count - 1] != '[') {
                        return false;
                    }
                } else {
                    if (arr[count - 1] != '{') {
                        return false;
                    }
                }
                count--;
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
