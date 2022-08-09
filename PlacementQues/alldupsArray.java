package PlacementQues;

public class alldupsArray {
    static void finder(int[] arr, int n) {
        int[] cnt = new int[n + 1];
        int repeated = -1;
        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
            if (cnt[arr[i]] > 1) {
                repeated = arr[i];
                System.out.print(repeated + " ");
            }
        }
        if (repeated == -1) {
            System.out.println("None repeated");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 1, 2, 2 };
        int n = arr.length;
        finder(arr, n);
    }
}
