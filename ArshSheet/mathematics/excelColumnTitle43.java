package ArshSheet.mathematics;

public class excelColumnTitle43 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int r = columnNumber % 26;
            columnNumber = columnNumber / 26;
            if (r != 0) {
                sb.append((char) (r - 1 + 'A'));
            } else {
                sb.append('Z');
                columnNumber--;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int k = 2147483647;
        System.out.println(convertToTitle(k));
    }
}
