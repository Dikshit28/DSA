package PlacementQues;

public class validateString {
    public static boolean reger(String s) {
        boolean check = false;
        // match string with same first and last character with regex
        if (s.matches("^[a-b]$|^([a-b]).*\\1$")) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        String s = "sadasdas";
        System.out.println(reger(s));
    }
}
