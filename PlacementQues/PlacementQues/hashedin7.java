package PlacementQues;

public class hashedin7 {
    public static String IntToStr(int k) {
        StringBuffer st = new StringBuffer();
        while (k > 0) {
            k--;
            st.insert(0, (char) (k % 26 + 'A'));
            k = k / 26;
        }
        return st.toString();
    }

    public static void main(String[] args) {
        int k = 27;
        System.out.println(IntToStr(k));
    }
}
