package ArshSheet.strings;

public class validNumber38 {
    public static boolean isNumber(String s) {
        s = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen)
                    return false;
                pointSeen = true;
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (eSeen || !numberSeen)
                    return false;
                numberSeen = false;
                eSeen = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && !(s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E'))
                    return false;
            } else
                return false;
        }
        return numberSeen;
    }

    public static boolean isNumbeRexex(String s) {
        return s.trim().matches("[-+]?(\\d+\\.?|\\.\\d+)\\d*([e||E][-+]?\\d+)?");
    }

    public static void main(String[] args) {
        String[] sarr = { "1E9", ".e1", "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1",
                "53.5e93",
                "-123.456e789" };
        for (String s : sarr) {
            System.out.print(s + " " + isNumber(s) + " " + isNumbeRexex(s) + ",");
        }
    }
}
