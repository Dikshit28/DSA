package ArshSheet.arrays;

public class stockBuySell06 {
    static int optimal(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;
    }

    static int solver(int[] arr) {
        int x = 0;
        int j = 0;
        int k = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[j]) {
                j = i;
                k = i;
            }
            if (arr[i] > arr[k]) {
                k = i;
            }
            if (arr[k] - arr[j] > x) {
                x = arr[k] - arr[j];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1 };
        int profit = solver(arr);
        System.out.println(profit);
        int[] arr1 = { 2, 4, 1 };
        int profit1 = optimal(arr1);
        System.out.println(profit1);
    }
}
