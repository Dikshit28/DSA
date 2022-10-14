package PlacementQues;

public class hashedin8 {
    public static int equalBlocks(String st) {
        int k = 0, j = 1, n = 0;
        int[] lens = new int[st.length()];
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) != st.charAt(i - 1)) {
                n = Math.max(n, j);
                lens[j]++;
                j = 0;
            }
            j++;
        }
        lens[j]++;
        for (int i = 1; i < n; i++) {
            k = k + (n - i) * lens[i];
        }
        return k;
    }

    public static void main(String[] args) {
        String st = "bbbabb";
        System.out.println(equalBlocks(st));
    }
}
