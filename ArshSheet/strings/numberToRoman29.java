package ArshSheet.strings;

/*
Symbol       Value
I             1
IV            4  
V             5
IX            9  
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
DM            900
M             1000
*/

public class numberToRoman29 {
    public static String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }
}
