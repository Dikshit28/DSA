package ArshSheet.searching_sorting;

public class minCostEqual56 {
    public static int minCostToMakeElementEqual(int[] a, int n) {
        if (n < 2)
            return 0;
        int target;
        if (n % 2 == 1) {
            target = a[n / 2];
        } else {
            target = (a[n / 2] + a[(n - 2) / 2]) / 2;
        }
        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost += Math.abs(target - a[i]);
        }
        return cost;
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 8 };
        int n = a.length;

        System.out.println(minCostToMakeElementEqual(a, n));
    }
}
