package PlacementQues;

public class royalMorseCodeOptum {
    public static int complaince(String[] arr) {
        int count = 0;
        for (String string : arr) {
            if (string.length() == 0) {
                continue;
            }
            count += (checker(string)) ? 1 : 0;
        }
        return count;
    }

    public static boolean checker(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' && st.length() != 0) {
                st.setLength(st.length() - 1);
            } else {
                st.append(s.charAt(i));
            }
        }
        return st.length() == 0;
    }

    public static void main(String[] args) {
        String[] arr = { "", "....---.-", ".-.-.-.-", "...---.-", "..---.", "-..--" };
        System.out.println(complaince(arr));
    }
}
